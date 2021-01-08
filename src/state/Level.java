package state;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import Entities.EntityManager;
import Entities.Ship;
import Entities.Tubby;
import map.BackGround;

public abstract class Level {

	protected EntityManager entityManager;
	protected Ship ship;
	protected Tubby player;
	
	protected StateManager stateManager;

	protected BackGround background;

	public abstract void init();

	public abstract void tick();

	public abstract void draw(Graphics2D g);

}
