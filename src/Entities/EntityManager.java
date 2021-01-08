package Entities;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import Main.KeyManager;

public class EntityManager {

	private ArrayList<Entity> entities;

	private Tubby player;
	private Ship ship;
	private int cookieCount = 0;

	public EntityManager() {
		entities = new ArrayList<Entity>();
	}

	public void add(Entity e) {
		entities.add(e);
		if(e instanceof Cookie) {
			System.out.println("c");
			cookieCount++;
			}
	}

	public void init() {
		for (Entity e : entities)
			e.init();
	}

	public void remove(Entity e) {
		entities.remove(e);
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void draw(Graphics2D g) {

		ship.draw(g);
		
		for (Entity e : entities)
			e.draw(g);

		player.draw(g);
	}
	
	public void checkAllCollected() {
		
		if(player.getCollectedCookies() == cookieCount)
			ship.openDoor();
		
	}

	public void tick() {

		player.tick();
		
		System.out.println(player.getCollectedCookies());
		
		checkAllCollected();
		
		if(player.getBoundaries().intersects(ship.getBoundaries()))
			ship.tick();

		for (Entity e : entities) {
			e.tick();
		}
		
	}

	public void setPlayer(Tubby player) {
		this.player = player;
	}

	public Tubby getPlayer() {
		return player;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	
}
