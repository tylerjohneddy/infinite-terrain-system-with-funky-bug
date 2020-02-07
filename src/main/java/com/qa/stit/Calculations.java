package com.qa.stit;

public class Calculations {

	public double distance(int[] player, int[] intrest) {
		int deltaX = player[0]-intrest[0];
		int deltaY = player[1]-intrest[1];
		double distance = Math.sqrt(Math.pow(deltaX, 2)+Math.pow(deltaY, 2));

		return distance;

	}
}
