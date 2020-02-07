package com.qa.stit;

public class Intrest {
	private int intrestX;
	private int intrestY;

	public int[] position() {
		this.intrestX = (int) Math.round(Math.random()*10);
		this.intrestY = (int) Math.round(Math.random()*10);
		int[] position = {intrestX,intrestY};
		return position;


	

	}
}
