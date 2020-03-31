package Game_Package;

public abstract  class BaseObject {
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
	public abstract void move();
	public abstract void draw(Canvas canvas);
	public boolean intersects(BaseObject object) {
		return distance(object) <= Math.max(this.radius, object.getRadius());
	}
	private double distance(BaseObject object) {
		double sq =  (this.getX() - object.getX()) * (this.getX() - object.getX()) + (this.getY() - object.getY())*(this.getY() - object.getY());
		return Math.sqrt(sq);
	}

	
}
