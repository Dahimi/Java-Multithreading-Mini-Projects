import java.awt.*;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.sun.glass.events.KeyEvent;

public class Room {
	private  int width ;
    private  int height ;
    private  Snake snake ;
    private Mouse mouse ;
	private int initialDelay = 520;
	private int delayStep =20;
    public static Room game ;
   
    public Room(int width, int height, Snake snake) {
		
		this.width = width;
		this.height = height;
		this.snake = snake;
		

	}
	public static void main(String[] args) {
		Snake snake = new Snake(3,9);
		 game = new Room(20,15,snake);
		snake.setDirection(SnakeDirection.DOWN);
		game.createMouse();
		game.run();
	}
	public void createMouse() {
		int random_x = (int) (Math.random() * width);
		int random_y = (int) (Math.random() * height);
	    mouse = new Mouse(random_x , random_y);
	
	}
	public void eatMouse() {
		createMouse();
	}
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Snake getSnake() {
		return snake;
	}
	public void setSnake(Snake snake) {
		this.snake = snake;
	}
	public Mouse getMouse() {
		return mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void run() {
		 // Create a KeyboardObserver object and start it.
                KeyboardObserver keyboardObserver = new KeyboardObserver();
       

        // As long as the snake is alive
        while (snake.isAlive()) {
            // Does the observer have any key events?
            if (keyboardObserver.isThereEvent()) {
                int key_code = keyboardObserver.getNextEvent();
                // If 'q', then exit the game.
                //if (event.getKeyChar() == 'q') return;

                // If "left arrow", then move the figure to the left
                System.out.println("code est " + key_code + "other " + KeyEvent.VK_LEFT);
                if (key_code == KeyEvent.VK_LEFT)
                    snake.setDirection(SnakeDirection.LEFT);
                    // If "right arrow", then move the figure to the right
                else if (key_code == KeyEvent.VK_RIGHT)
                    snake.setDirection(SnakeDirection.RIGHT);
                    // If "up arrow", then move the figure up
                else if (key_code == KeyEvent.VK_UP)
                    snake.setDirection(SnakeDirection.UP);
                    // If "down arrow", then move the figure down
                else if (key_code == KeyEvent.VK_DOWN)
                    snake.setDirection(SnakeDirection.DOWN);
            }

            snake.move();
            // Move the snake
            System.out.println(snake.getY() + " and height  :"  + game.width);
            print();        // Display the current game state
            sleep();        // Pause between moves
        }

        // Display "Game Over"
        System.out.println("Game Over!");
	}
	public void print() {
		

		// Create an array where we will "draw" the current game state
        int[][] matrix = new int[height][width];

        // Draw all the parts of the snake
        ArrayList<SnakeSection> sections = new ArrayList<SnakeSection>(snake.getSections());
        for (SnakeSection snakeSection : sections) {
            matrix[snakeSection.getY()][snakeSection.getX()] = 1;
        }

        // Draw the head of the snake (4 - if the snake is dead)
        
        matrix[snake.getX()][snake.getY()] = snake.isAlive() ? 2 : 4;

        // Draw the mouse
        matrix[mouse.getX()][mouse.getY()] = 3;

        // Display it all on the screen
        String[] symbols = {" . ", " x ", " X ", "^_^", "RIP"};
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(symbols[matrix[y][x]]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();	
	}
	public void sleep() {
		  try {
	            int level = snake.getSections().size();
	            int delay = level < 15 ? (initialDelay - delayStep * level) : 200;
	            Thread.sleep(delay);
	        } catch (InterruptedException e) {
	        }
	}
	class KeyboardObserver implements KeyListener{
    	private Queue<Integer> keyEvents = new ArrayBlockingQueue<Integer>(100);
    	private int nextEvent ;
    	public KeyboardObserver() {
    		JFrame frame = new JFrame();
    	    JTextField text = new JTextField();
    	    text.transferFocus();
    	    text.setSize(10, 5);
    		frame.getContentPane().add(BorderLayout.SOUTH ,text);
    		frame.setVisible(true);
    		frame.setSize(100, 100);
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		text.addKeyListener(this);
    		
    	}
    	
    		
    	
    	public boolean isThereEvent() {
    		
    		return !keyEvents.isEmpty();
    	}
    	public int getNextEvent() {
    		System.out.println( "size " + keyEvents.size());
    	     nextEvent = keyEvents.poll();
    	     System.out.println("size"  + keyEvents.size());    	     
    	     return nextEvent;
    	}
		@Override
		public void keyPressed(java.awt.event.KeyEvent event) {
			// TODO Auto-generated method stub
			System.out.print("ca marche ici ");
			keyEvents.add(event.getKeyCode());
			
		}

		@Override
		public void keyReleased(java.awt.event.KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(java.awt.event.KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
    	
    }

}


