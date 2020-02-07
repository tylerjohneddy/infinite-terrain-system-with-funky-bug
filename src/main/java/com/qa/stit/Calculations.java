package com.qa.stit;

public class Calculations {

	/**
	 * @param player
	 * @param intrest
	 * @return
	 */
	public double distance(Player player, Intrest intrest) {
		int deltaX = player.getPlayerPostiion()[0]-intrest.getPosition()[0];
		System.out.println("I am calculating DeltaX");
		int deltaY = player.getPlayerPostiion()[1]-intrest.getPosition()[1];
		System.out.println("I am calculating DeltaY");
		double distance = Math.sqrt(Math.pow(deltaX, 2)+Math.pow(deltaY, 2));

		return distance;

	}
}
