package Entities;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public abstract class Entity {

	protected double x;
	protected double y;
	protected double WIDTH;
	protected double HEIGHT;

	protected BufferedImage activePortrait;

	Rectangle boundaries;

	public Entity(double x, double y, int width, int height) {

		this.x = x;
		this.y = y;
		this.HEIGHT = height;
		this.WIDTH = width;

		boundaries = new Rectangle((int) x, (int) y, width, height);

	}

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

	public double getWIDTH() {
		return WIDTH;
	}

	public void setWIDTH(double wIDTH) {
		WIDTH = wIDTH;
	}

	public double getHEIGHT() {
		return HEIGHT;
	}

	public void setHEIGHT(double hEIGHT) {
		HEIGHT = hEIGHT;
	}

	public Rectangle getBoundaries() {
		return boundaries;
	}

	public abstract void tick();

	public abstract void init();

	public abstract void draw(Graphics2D g);

	public boolean isSolid() {

		return true;

	}
}
