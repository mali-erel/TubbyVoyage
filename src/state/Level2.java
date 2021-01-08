package state;

import java.awt.Graphics2D;

import Entities.Cookie;
import Entities.EntityManager;
import Entities.Platform;
import Entities.Ship;
import Entities.Tubby;
import Main.Assets;
import map.BackGround;

public class Level2 extends Level {

	public Level2(StateManager stateManager) {

		this.stateManager = stateManager;
		init();

	}

	@Override
	public void init() {

		this.entityManager = new EntityManager();
		ship = new Ship(500, 700, 100, 100, stateManager);
		player = new Tubby("red", 0, 600, 120, 140, entityManager);
		entityManager.setPlayer(player);
		this.background = new BackGround(Assets.bg1, 1);
		this.background.setVector(1, 0);
		entityManager.add(new Platform(1500, 650, 200, 200, Assets.menu));
		entityManager.setShip(ship);
//		entityManager.add(new Platform(500,300,50,200, Assets.menu));
		entityManager.add(new Cookie(200, 700, 20, 20, entityManager));
		entityManager.add(new Platform(0, 820, 1600, 80, Assets.menu));
		entityManager.init();

	}

	@Override
	public void tick() {

		entityManager.tick();
		background.tick();
	}

	@Override
	public void draw(Graphics2D g) {

		background.draw(g);
		entityManager.draw(g);
	}

}
