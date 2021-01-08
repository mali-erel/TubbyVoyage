package Entities;

import java.awt.Graphics2D;

import Main.Assets;

public class Cookie extends Entity {

	private EntityManager entityManager;

	public Cookie(double x, double y, int width, int height, EntityManager entityManager) {
		super(x, y, width, height);
		this.entityManager = entityManager;
		this.activePortrait = Assets.yellowTubbyR;
	}

	@Override
	public void tick() {

		if (this.boundaries.intersects(entityManager.getPlayer().boundaries)) {

			entityManager.getPlayer().setCollectedCookies(entityManager.getPlayer().getCollectedCookies() + 1);
			entityManager.remove(this);
			entityManager.getPlayer().collectEmAll();
		}
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(Graphics2D g) {
		g.drawImage(activePortrait, (int) x, (int) y, (int) WIDTH, (int) HEIGHT, null);

	}
	
	public boolean isSolid(){
		
		return false;
		
	}

}
