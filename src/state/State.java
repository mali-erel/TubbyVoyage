package state;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import map.BackGround;

public abstract class State {

	protected StateManager stateManager;

	protected BackGround background;

	public abstract void init();

	public abstract void tick();

	public abstract void draw(Graphics2D g);

}
