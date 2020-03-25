 
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
		
	char[][] draw = new char[width][height];
	for(int i = 0 ; i < width ; i++) {
		for(int j = 0 ; j < height ; j++) {
			
			draw[i][j] = '.';
		}
	}
			// drawing the mouse
	draw[mouse.getX()][mouse.getY()] ='x';
			// drawing the sanke Head
	draw[snake.getX()][snake.getY()] = 'o';
			// drawing the snake sections

	for(SnakeSection section : snake.getSections()) {
		
		draw[section.getX()][section.getY()] ='x';
	}
	for(int i = 0 ; i < width ; i++) {
		
		for(int j = 0 ; j< height ; j++) {
			System.out.print(draw[i][j]);
		}
		System.out.println();
	}
		
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
