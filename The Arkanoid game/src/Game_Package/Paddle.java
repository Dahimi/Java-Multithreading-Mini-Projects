package Game_Package;

public class Paddle extends BaseObject {
	private double speed ;
    private short direction ;
    
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public short getDirection() {
		return direction;
	}

	public void setDirection(short direction) {
		this.direction = direction;
	}

	public Paddle(double x, double y) {
		super(x, y, 3);
		this.speed = 1;
		this.direction =0;
		// TODO Auto-generated constructor stub
	}
	public void moveRight(){
	    this.direction = 1;
	}
	public void moveLeft(){
	    this.direction = -1;
	}

	
	@Override
	public void draw(Canvas canvas) {
		// TODO Auto-generated method stub
		canvas.setPoint(this.x , this.y , 'P');
		
	}
	@Override
	public void move() {
		this.x += direction * speed ;
		// TODO Auto-generated method stub
		
	}

	
	

}
