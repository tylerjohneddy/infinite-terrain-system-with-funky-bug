package com.qa.stit;

public class Intrest {
	private int interestX;
	private int interestY;

	/**
	 * @return
	 * returns an int list of with the {x, y} position of the item of interest
	 * 
	 */
	public int[] getPosition() {
		this.interestX = (int) Math.round(Math.random()*10);
		this.interestY = (int) Math.round(Math.random()*10);
		int[] position = {interestX,interestY};
		System.out.println("Here!" +interestX);
		System.out.println("There!" +interestY);
		return position;


	

	}
}
