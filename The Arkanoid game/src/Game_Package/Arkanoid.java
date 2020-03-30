package Game_Package;

import java.util.*;

public class Arkanoid {
	private int width ;
	private int height;
	private Ball ball;
	private Paddle paddle;
	private List<Brick> bricks ;
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
		
	}
}
