package PongGame;

import java.awt.*;
import java.util.*;
public class Ball extends Rectangle{
    Random random;
	int xVelocity;
	int yVelocity;
	int initialSpeed = 2;
	
	public Ball(int x, int y, int width, int height){	//控制球的位置
		super(x,y,width,height);
		random = new Random();
		int randomXDirection = random.nextInt(2);
		if(randomXDirection == 0)	//左右
			randomXDirection--;
		setXDirection(randomXDirection*initialSpeed);
		
		int randomYDirection = random.nextInt(2);
		if(randomYDirection == 0)	//上下
			randomYDirection--;
		setYDirection(randomYDirection*initialSpeed);		
	}
	
	public void setXDirection(int randomXDirection) {
		xVelocity = randomXDirection;
	}

	public void setYDirection(int randomYDirection) {
		yVelocity = randomYDirection;
	}

	public void move() {
		x += xVelocity;
		y += yVelocity;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, height, width);
	}
}
