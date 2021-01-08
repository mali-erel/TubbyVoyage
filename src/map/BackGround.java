package map;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import Main.Assets;
import Main.GamePanel;

public class BackGround {

	private double x;
	private double y;
	private double WIDTH;
	private double HEIGHT;
	private double moveScale;
	private double dx;
	private double dy;
	private BufferedImage bg;

	public BackGround(BufferedImage image, double moveScale) {
		this.moveScale = moveScale;
		bg = image; // Read the image with image reader

	}

	public void setLocation(double x, double y) {

		this.x = (x * moveScale) % GamePanel.WIDTH;
		this.y = (y * moveScale) % GamePanel.HEIGHT;
		;

	}

	public void setVector(double dx, double dy) {

		this.dx = dx;
		this.dy = dy;

	}

	public void tick() {

		x += dx;
		y += dy;

	}

	public void draw(Graphics2D g) {
		g.drawImage(bg, (int) x, (int) y, null);
		if (x < 0) {
			g.drawImage(bg, (int) x + GamePanel.WIDTH, (int) y, null);
		} else if (x > 0) {
			g.drawImage(bg, (int) x - GamePanel.WIDTH, (int) y, null);
		}
	}
}
