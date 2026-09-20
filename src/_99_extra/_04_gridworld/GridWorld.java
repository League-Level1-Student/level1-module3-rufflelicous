package _99_extra._04_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Random gen = new Random();
			int i = gen.nextInt(10);
			World wow = new World();
			wow.show();
			Bug goat = new Bug();
			Flower flowey = new Flower();
			Flower aqua = new Flower();
			goat.turn();
			goat.turn();
			goat.setColor(Color.blue);
			Location gra = new Location(5, 5);
			Location fl = new Location(5, 6);
			Location a = new Location(5, 4);
			wow.add(gra, goat);
			wow.add(fl, flowey);
			wow.add(a, aqua);
			

	}

}
