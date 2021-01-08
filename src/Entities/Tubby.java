package Entities;

import java.awt.Graphics2D;

import Main.Assets;
import Main.KeyManager;

public class Tubby extends Creature {

	private int collectedCookies;
	private boolean readyToGo;
	private double acceleration;
	private String type;
	private boolean skipping;
	private boolean moving = false;
	private boolean atGround = true;
	private EntityManager entityManager;

	public Tubby(String type, double x, double y, int width, int height, EntityManager entityManager) {
		super(x, y, width, height);

		this.entityManager = entityManager;
		readyToGo = false;
		collectedCookies = 0;
		this.type = type;

		setColor(type);

		activePortrait = portrait[0];

		acceleration = 0.92;
		speed = 0;
		jumpStrength = 0;
		weight = 2.5;

	}

	@Override
	public void tick() {

		move();
		jump();
		skip();
		gravity();
		collectEmAll();

	}

	@Override
	public void init() {

	}

	public void jump() {

		if (KeyManager.up) {
			checkIfGround();
			if (atGround) {
				jumpStrength = -40;
			}

		}

	}

	@Override
	public void draw(Graphics2D g) {

		g.drawImage(activePortrait, (int) this.x, (int) this.y, (int) WIDTH, (int) HEIGHT, null);

		g.draw(boundaries);

	}

	@Override
	public void move() {

		if (KeyManager.left && KeyManager.right || !KeyManager.left && !KeyManager.right) {
			moving = false;
			deAccelerate();
		}

		else if (KeyManager.left) {
			moving = true;
//			jumpStrength = -20;
			activePortrait = portrait[1];
			speed--;
		} else if (KeyManager.right) {
			moving = true;
//			jumpStrength = -20;
			activePortrait = portrait[0];
			speed++;
		}

//		Speed Limit

		if (speed < -15)
			speed = -15;
		if (speed > 15)
			speed = 15;

//		Makes the move

		checkCollision();

		x += speed;
		y += jumpStrength;

		boundaries.y = (int) y;
		boundaries.x = (int) x;

	}

	public void gravity() {

		jumpStrength += weight;

	}

	public void skip() {

		if (moving && KeyManager.up)
			jump();

		else if (moving) {
			checkIfGround();
			if (atGround) {
				jumpStrength = -20;
			}

		}

	}

	public void collectEmAll() {
		
		if(collectedCookies == 3)
			readyToGo = true;
		else
			readyToGo = false;
	}
	
	
	
	public boolean isAtGround() {
		return atGround;
	}

	public void setAtGround(boolean atGround) {
		this.atGround = atGround;
	}

	public void checkIfGround() {

		boundaries.y++;
		for (Entity e : entityManager.getEntities()) {
			if (e.boundaries.intersects(boundaries)) {
				atGround = true;
				break;
			} else {
				atGround = false;

			}
		}
		boundaries.y--;
	}

	public void checkCollision() {

//		Horizontal Collision Check

		boundaries.x += speed;

		for (Entity e : entityManager.getEntities()) {

			if (boundaries.intersects((e.boundaries)) && e.isSolid()) {

				boundaries.x -= speed;
				while (!e.boundaries.intersects(boundaries))
					boundaries.x += Math.signum(speed);
				boundaries.x -= Math.signum(speed);
				speed = 0;
				x = boundaries.x;

			}

		}

//		Vertical Collision Check

		boundaries.y += jumpStrength;

		for (Entity e : entityManager.getEntities()) {
			if (boundaries.intersects((e.boundaries)) && e.isSolid()) {

				boundaries.y -= jumpStrength;
				while (!e.boundaries.intersects(boundaries))
					boundaries.y += Math.signum(jumpStrength);
				boundaries.y -= Math.signum(jumpStrength);
				jumpStrength = 0;
				y = boundaries.y;

			}

		}

	}

	public void accelerate() {

		speed /= acceleration;

	}

	public void deAccelerate() {

		speed *= acceleration;

	}

	public void setColor(String color) {
		if (color.equals("red")) {
			this.portrait[0] = Assets.redTubbyR;
			this.portrait[1] = Assets.redTubbyL;
		} else if (color.equals("purple")) {
			this.portrait[0] = Assets.purpleTubbyR;
			this.portrait[1] = Assets.purpleTubbyL;
		} else if (color.equals("yellow")) {
			this.portrait[0] = Assets.yellowTubbyR;
			this.portrait[1] = Assets.yellowTubbyL;
		} else if (color.equals("green")) {
			this.portrait[0] = Assets.greenTubbyR;
			this.portrait[1] = Assets.greenTubbyL;
		}
	}

	public int getCollectedCookies() {
		return collectedCookies;
	}

	public void setCollectedCookies(int collectedCookies) {
		this.collectedCookies = collectedCookies;
	}

	public boolean isReadyToGo() {
		return readyToGo;
	}

	public void setReadyToGo(boolean readyToGo) {
		this.readyToGo = readyToGo;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isSkipping() {
		return skipping;
	}

	public void setSkipping(boolean skipping) {
		this.skipping = skipping;
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}

}
