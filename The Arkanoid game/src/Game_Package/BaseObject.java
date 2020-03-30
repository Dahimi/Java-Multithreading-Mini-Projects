package Game_Package;

public  class BaseObject {
	private  double x;
	private double y;
	private  double radius;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public  BaseObject(double x , double y , double radius) {
		this.radius = radius ;
		this.x = x;
		this.y = y;
	}
	public void move() {
		
	}

	
}
