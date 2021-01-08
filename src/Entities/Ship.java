package Entities;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import Main.Assets;
import state.StateManager;

public class Ship extends Entity {

	private boolean doorOpen;
	private StateManager stateManager;

	public Ship(double x, double y, int width, int height, StateManager stateManager) {
		super(x, y, width, height);
		this.stateManager = stateManager;
		doorOpen = false;
		this.activePortrait = Assets.purpleTubbyL;
	}

	@Override
	public void tick() {

		if (doorOpen)
			stateManager.nextLevel();

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(Graphics2D g) {
		g.drawImage(activePortrait, (int)x, (int)y, (int)WIDTH, (int)HEIGHT, null);

	}

	public void openDoor() {
		
		this.doorOpen = true;
		
	}
	
}
