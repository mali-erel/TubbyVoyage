package Entities;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Enemy extends Creature {

	public Enemy(double x, double y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void tick() {
		move();
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.drawImage(activePortrait, (int)x, (int)y, (int)WIDTH, (int)HEIGHT, null);
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

}
