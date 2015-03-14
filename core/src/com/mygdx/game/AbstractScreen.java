package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

public abstract class AbstractScreen implements Screen {

	protected SpriteBatch batch;
	protected Terra game;
	protected Stage stage;
	
	public AbstractScreen(Terra game) {
		this.game = game;
		this.batch = new SpriteBatch();
		this.stage = new Stage();
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	public void render(float delta) {
		Gdx.gl.glClearColor( 0f, 0f, 0f, 1f );
        //Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT );
        
        stage.act(delta);
        stage.draw();

	}

	@Override
	public void resize(int width, int height) {
		Gdx.app.log(Terra.LOG, "Resizing screen: " + this.getClass().getSimpleName());;
	}

	@Override
	public void pause() {
		Gdx.app.log(Terra.LOG,  "Pausing screen: " + this.getClass().getSimpleName());

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		batch.dispose();
		
	}

}
