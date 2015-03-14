package com.mygdx.game;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class SplashScreen extends AbstractScreen {

	private Background background;
	private Terra game;
	private Stage stage;
	private float fadeTimer = 0f;
	
	public SplashScreen(Terra game) {
		super(game);
		this.game = game;
		this.stage = new Stage();
		this.background = new Background();
	}
	
	/**
	 * Creates a new background for the SplashScreen, grows it a bit
	 * and cuts it with the TextureRegion.
	 */
	public void show() {
		super.show();
	}
	
	public void resize(int width, int height) {
		super.resize(width, height);
		stage.addActor(background);
	
	}
	
	public void render(float delta) {
		super.render(delta);
		fader();
		
		if (fadeTimer > 1f) {
			game.setScreen(new MenuScreen(game));
		} else {
			fadeTimer += 0.015f;
		}
		
		stage.draw();
	}
	
	
	public void fader() {
		background.getColor().a = fadeTimer;
	}
	
	public void dispose() {
		super.dispose();
	}
	
	public void nextScreen() {
		game.setScreen(new FirstLevelScreen(game));
	}

}
