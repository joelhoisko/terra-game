package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.FPSLogger;

public class Terra extends Game {
	
	public static final String LOG = Terra.class.getSimpleName();
	private FPSLogger fpsLogger;

	/**
	 * Creates a new FPSLogger and sets the starting screen of the game
	 */
	public void create () {
		Gdx.app.log(LOG, "Creating game");
		fpsLogger = new FPSLogger();
		setScreen(new SplashScreen(this));
	}

	/**
	 * Renders the game and logs the current fps.
	 */
	public void render () {
		super.render();
		fpsLogger.log();
	}
	
	/**
	 * A simple method the set the current Screen of the game and logs the change.
	 */
	public void setScreen(Screen screen) {
		super.setScreen(screen);
		Gdx.app.log(LOG, "Setting screen: " + screen.getClass().getSimpleName());
	}
	
	public void dispose() {
		super.dispose();
		Gdx.app.log(LOG, "Disposing game");
	}
}
