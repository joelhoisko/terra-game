package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Background extends Actor {
	
	private Texture backgroundTexture;
	private TextureRegion backgroundRegion;
	
	public Background() {
		backgroundTexture = new Texture("Mountain_Background.png");
		backgroundTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		backgroundRegion = new TextureRegion(backgroundTexture, 0, 0, 256, 144);
	}
	
	public void draw(Batch batch, float parentAlpha) {
		Color color = getColor();
        batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
		batch.draw(backgroundRegion, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	}

}
