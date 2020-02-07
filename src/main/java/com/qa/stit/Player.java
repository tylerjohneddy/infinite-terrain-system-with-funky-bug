package com.qa.stit;

public class Player {
	private int[] playerPostiion = {0,0};
	public Player() {
		this.playerPostiion[0] = (int) Math.round(Math.random()*10);
		this.playerPostiion[1] = (int) Math.round(Math.random()*10);
	}


	public int[] getPlayerPostiion() {
		
		return playerPostiion;
	}

	public void setPlayerX(int playerX) {
		this.playerPostiion[0] = playerX;
	}

	public void setPlayerY(int playerY) {
		this.playerPostiion[1] = playerY;
	}

}
