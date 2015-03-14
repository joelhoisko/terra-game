package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class MenuScreen extends AbstractScreen {

	private Label startLabel;
	private Skin skin;
	private Stage stage;
	private Background background;
	private LabelStyle labelStyle = new LabelStyle(new BitmapFont(), Color.WHITE);
	
	public MenuScreen(Terra game) {
		super(game);
		stage = new Stage();
		startLabel = new Label("Start game", labelStyle);
		background = new Background();
	}
	
	public void show() {
		startLabel.setPosition(Gdx.graphics.getWidth()/2 - 20, Gdx.graphics.getHeight()/2);
		stage.addActor(background);
		stage.addActor(startLabel);
	}
	
	public void render(float delta) {
		super.render(delta);
		
		stage.draw();
		
		if (Gdx.input.isKeyPressed(Keys.SPACE) || Gdx.input.isKeyPressed(Keys.ENTER)) {
			game.setScreen(new FirstLevelScreen(game));
		}
	}

}
