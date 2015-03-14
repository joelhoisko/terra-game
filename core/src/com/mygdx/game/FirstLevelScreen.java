package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class FirstLevelScreen extends AbstractScreen {

	private Stage stage;

	private Hero hero;
	private Background background;
	
	private Rain rain;
	private ArrayList<Rain> rainList = new ArrayList<Rain>();
	
	//private long rainTimer;
	//private long heroTimer;


	public FirstLevelScreen(Terra game) {
		super(game);
		stage = new Stage();
		hero = new Hero();
		background = new Background();
		rain = new Rain();
		//rainTimer = TimeUtils.nanoTime();
		rainList.add(rain);
	}

	public void show() {
		super.show();

	}

	public void render(float delta) {
		super.render(delta);

		hero.heroMovement();
		
		stage.addActor(background);
		stage.addActor(hero);
		
		stage.draw();

	}	

	/*
	public void rainTimeChecker() {

		if (TimeUtils.timeSinceNanos(rainTimer) > 50000000l) {
			Rain rain = new Rain();
			rainList.add(rain);
			rainList.remove(0);
			this.rainTimer = TimeUtils.nanoTime();
		} 
	}

	public void rainMaker(Rain rain) {
		for (Raindrop drop : rain.getRain()) {
			batch.draw(drop.getRaindropTexture(), drop.getRaindropX(), drop.getRaindropY());
			rain.moveAllRain();
		}		
	}
	*/

	/*
	public void heroAnimator() {

		if (TimeUtils.timeSinceNanos(heroTimer) > 1000000000l) {
			batch.draw(hero.getHeroTallRegion(), hero.getHeroX(), hero.getHeroY(), hero.getHeroWidth()*5, hero.getHeroHeight()*5);

		} else {
			batch.draw(hero.getHeroLowRegion(), hero.getHeroX(), hero.getHeroY(), hero.getHeroWidth()*5, hero.getHeroHeight()*5);
		}

	}
	*/

}
