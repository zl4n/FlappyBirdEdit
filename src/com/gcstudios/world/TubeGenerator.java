package com.gcstudios.world;

import com.gcstudios.entities.Entity;
import com.gcstudios.entities.Tube;
import com.gcstudios.main.Game;

public class TubeGenerator {
	
	public int time = 0;
	public int targetTime = 60;

	public void tick() {
		time++;
		if(time == 60) {
			//There created our new tube and reset our counter.
			int altura1 = Entity.rand.nextInt(60 - 30) + 30;
			Tube tubo1 = new Tube(Game.WIDTH,0,20,altura1,1,Game.spritesheet.getSprite(32, 32, 16, 16));
			
			int altura2 = Entity.rand.nextInt(60 - 30) + 30;
			Tube tubo2 = new Tube(Game.WIDTH,Game.HEIGHT- altura2,20,altura2,1,Game.spritesheet.getSprite(32, 32, 16, 16));
			
			Game.entities.add(tubo1);
			Game.entities.add(tubo2);
			time = 0;
		}			
	}	
}
