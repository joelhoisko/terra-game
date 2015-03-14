package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public abstract class Character {
	
	private Texture texture;
	private TextureRegion textureRegion;
	
	private int characterX;
	private int characterY;
	
	
	
	public int getCharacterX() {
		return characterX;
	}
	public void setCharacterX(int characterX) {
		this.characterX = characterX;
	}
	public int getCharacterY() {
		return characterY;
	}
	public void setCharacterY(int characterY) {
		this.characterY = characterY;
	}
	public Texture getTexture() {
		return texture;
	}
	public TextureRegion getTextureRegion() {
		return textureRegion;
	}

}
