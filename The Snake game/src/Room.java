 
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
		sleep();
		print();
	}
	public void print() {
		

        // Create an array where we will "draw" the current game state
        // Draw all the parts of the snake
        // Draw the mouse
        // Display it all on the screen

 int[][] grid = new int[height][width];
    for (SnakeSection s:snake.getSections()) {
        //make snake body into 1;
        grid[s.getY()][s.getX()] = 1;

    }
    //make snake head
    grid[snake.getY()][snake.getX()] = 2;
    //make mouse
    grid[mouse.getY()][mouse.getX()] = 3;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
            if (grid[i][j] == 1)
                sb.append("x");
            else if (grid[i][j] == 2)
                sb.append("X");
            else if (grid[i][j] == 3)
                sb.append("^");
            else
                sb.append(".");
        }
        sb.append("\n");
    }
    System.out.println(sb.toString());
		
	}
	public void sleep() {
		  try {
	            int level = snake.getSections().size();
	            int delay = level < 15 ? (initialDelay - delayStep * level) : 200;
	            Thread.sleep(delay);
	        } catch (InterruptedException e) {
	        }
	}
}


