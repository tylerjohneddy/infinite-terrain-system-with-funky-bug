package com.qa.stit;

public class Intrest {
	private int interestX;
	private int interestY;
	private int[] position = new int[2];

	
	public Intrest() {
		this.interestX = (int) Math.round(Math.random()*10);
		this.interestY = (int) Math.round(Math.random()*10);
		int[] position = {interestX,interestY};

	}
	
	
	/**
	 * @return
	 * returns an int list of with the {x, y} position of the item of interest
	 * 
	 */
	public int[] getPosition() {
		return position;


	

	}
}
