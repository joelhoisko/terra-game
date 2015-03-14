package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;

public class Raindrop {
	
	private Texture raindropTexture;
	private int raindropX;
	private int raindropY = 500;
	private int speedX = 0;
	private int speedY = -1;

	
	public Raindrop() {
		this.raindropTexture = new Texture("Rain.png");
		setRaindropX(MathUtils.random(-50, 640));
	}
	
	public Texture getRaindropTexture() {
		return raindropTexture;
	}
	
	public int getRaindropX() {
		return raindropX;
	}
	
	public int getRaindropY() {
		return raindropY;
	}
	
	public void setRaindropX(int x) {
		raindropX = x;
	}
	
	public void setRaindropY(int y) {
		raindropY = y;
	}

	public int getSpeedY() {
		return speedY;
	}

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}
	
	public int getSpeedX() {
		return speedX;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}
	
	public void moveRaindrop() {
		this.raindropX = this.raindropX + speedX;
		this.raindropY = this.raindropY + speedY;
	}
}
