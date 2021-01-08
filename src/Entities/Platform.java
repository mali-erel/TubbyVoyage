package Entities;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import Main.Assets;

public class Platform extends Entity {

	public Platform(double x, double y, int width, int height, BufferedImage portrait) {
		super(x, y, width, height);
		this.activePortrait = portrait;
	}

	@Override
	public void tick() {
		

	}

	@Override
	public void init() {
		

	}

	@Override
	public void draw(Graphics2D g) {
		g.drawImage(activePortrait,(int)x, (int)y, (int)WIDTH, (int)HEIGHT, null);
		g.draw(boundaries);

	}

}
