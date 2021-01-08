package state;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import Main.GamePanel;

public class StateManager {

	private ArrayList<Level> states;
	private int currentState;

	private GamePanel gamePanel;

	private static final int level1 = 0;
	private static final int level2 = 1;
	private static final int level3 = 2;

	public StateManager(GamePanel gamePanel) {

		this.gamePanel = gamePanel;

		states = new ArrayList<Level>();

		states.add(new Level1(this));
		states.add(new Level2(this));
		currentState = level1;
	}

	public void setState(int state) {

		this.currentState = state;
		states.get(state).init();

	}

	public void nextLevel() {

		currentState++;
		
	}

	public void tick() {

		states.get(currentState).tick();
	}

	public void draw(Graphics2D g) {
		states.get(currentState).draw(g);

	}
}
