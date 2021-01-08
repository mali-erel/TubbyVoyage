package Entities;

import java.awt.image.BufferedImage;

public abstract class Creature extends Entity {

	protected boolean dx;
	protected boolean dy;
	protected BufferedImage[] portrait;
	
	public Creature(double x, double y, int width, int height) {
		super(x, y, width, height);
		portrait = new BufferedImage[2];
	}
	protected int health;
	protected double speed;
	protected double jumpStrength;
	protected double weight;
	
	public abstract void move();
	
}
