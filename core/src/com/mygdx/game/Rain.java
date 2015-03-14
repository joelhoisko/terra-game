package com.mygdx.game;

import java.util.ArrayList;

public class Rain {
	
	private ArrayList<Raindrop> rain = new ArrayList<Raindrop>();
	
	public Rain() {
		
		for (int i = 0; i < 100; i++) {
			spawnRaindrop();
		}
	}
	
	public void spawnRaindrop() {
		
		this.rain.add(new Raindrop());
	}
	
	public void moveAllRain() {
		
		for (Raindrop drop : rain) {
			drop.moveRaindrop();
			
			if (drop.getRaindropY() > 500) {
				rain.remove(drop);
			}
		}
	}

	public ArrayList<Raindrop> getRain() {
		return rain;
	}

	public void setRain(ArrayList<Raindrop> rain) {
		this.rain = rain;
	}

}
