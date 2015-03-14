package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Hero extends Actor {

	private Texture heroTexture;
	private TextureRegion heroLowRegion;
	private TextureRegion heroTallRegion;
	
	//private TextureRegion[][] animationRegion;
	
	private int heroX = 0;
	private int heroY = 0;

	public Hero() {
		heroTexture = new Texture("Cut_Hero.png");
		heroLowRegion = new TextureRegion(heroTexture, 3, 0, 10, 15);
		heroTallRegion = new TextureRegion(heroTexture, 19, 0, 10, 15);
		
		//animationRegion = TextureRegion.split(heroTexture, getHeroWidth(), getHeroHeight());
	}
	
	public void draw(Batch batch, float parentAlpha) {
		Color color = getColor();
		batch.setColor(color.r, color.g, color.b, parentAlpha);
		
		batch.draw(heroLowRegion, heroX, heroY, getHeroWidth() * 5, getHeroHeight() * 5);
	}
	
	public void heroMovement() {
		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			setHeroX(getHeroX() - 5);
		}
		if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			setHeroX(getHeroX() + 5);
		}
		
		if (Gdx.input.isKeyPressed(Keys.SPACE)) {
			jump();
		}
		
		if (heroX + getHeroWidth() > Gdx.graphics.getWidth()) {
			setHeroX(Gdx.graphics.getWidth() - getHeroWidth());
		}
		if (heroX < 0) {
			setHeroX(0);
		}
		
	}
	public void jump() {
		heroY += 5;
	}

	public Texture getHeroTexture() {
		return heroTexture;
	}

	public void setHeroTexture(Texture heroTexture) {
		this.heroTexture = heroTexture;
	}

	public TextureRegion getHeroLowRegion() {
		return heroLowRegion;
	}

	public void setHeroLowRegion(TextureRegion heroLowRegion) {
		this.heroLowRegion = heroLowRegion;
	}

	public TextureRegion getHeroTallRegion() {
		return heroTallRegion;
	}

	public void setHeroTallRegion(TextureRegion heroTallRegion) {
		this.heroTallRegion = heroTallRegion;
	}

	public int getHeroX() {
		return heroX;
	}

	public void setHeroX(int heroX) {
		this.heroX = heroX;
	}

	public int getHeroY() {
		return heroY;
	}

	public void setHeroY(int heroY) {
		this.heroY = heroY;
	}

	public int getHeroWidth() {
		return heroLowRegion.getRegionWidth();
	}

	public int getHeroHeight() {
		return heroLowRegion.getRegionHeight();
	}

}
