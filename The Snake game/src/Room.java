 
public class Room {
	private  int width ;
    private  int height ;
    private  Snake snake ;
    private Mouse mouse ;
    public static Room game ;
    public Room(int width, int height, Snake snake) {
		
		this.width = width;
		this.height = height;
		this.snake = snake;

	}
	public static void main(String[] args) {
		Snake snake = new Snake(3,9);
		 game = new Room(100,100,snake);
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
	}
	public void print() {
		
	}
	public void sleep() {
		
	}

}
