package Game_Package;

import java.util.*;

public class Arkanoid {
	private int width ;
	private int height;
	private Ball ball;
	private Paddle paddle;
	private List<Brick> bricks ;
	private boolean isGameOver = false;
	public static Arkanoid game;
	public Ball getBall() {
		return ball;
	}
	public void setBall(Ball ball) {
		this.ball = ball;
	}
	public Paddle getPaddle() {
		return paddle;
	}
	public void setPaddle(Paddle paddle) {
		this.paddle = paddle;
	}
	public List<Brick> getBricks() {
		return bricks;
	}
	public void setBricks(List<Brick> bricks) {
		this.bricks = bricks;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Arkanoid(int width , int height){
	    this.width = width;
	    this.height = height;
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
	public void run() {
		move();
	}
	public void move() {
		paddle.move();
		ball.move();
	}
	public void draw(Canvas canvas) {
		for(Brick brick : bricks) {
			brick.draw(canvas );
		}
		paddle.draw(canvas);
		ball.draw(canvas);
	}
	public void checkBrickCollision() {
		List<Brick> bricks_copy = new ArrayList<Brick>(bricks);
		for(Brick brick : bricks_copy) {
		if(	ball.intersects(brick)) {
			bricks.remove(brick);
			double angle = Math.random() * 360;
			ball.setDirection(angle);
			return;
		}
		}
	}
	public void checkPaddleCollision() {
		if(ball.intersects(paddle)) {
			double angle = 90 + 20 * (Math.random() - 0.5);
			ball.setDirection(angle);
		}
	}
	public void checkGameOver() {
		isGameOver = ball.getY() > this.height;
	}
	
}
