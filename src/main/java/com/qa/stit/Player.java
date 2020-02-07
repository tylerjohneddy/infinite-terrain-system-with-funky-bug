package com.qa.stit;

public class Player {
	private int[] playerPostiion = { 0, 0 };

	/**
	 * the default constructor randomly assigns the player with a starting position
	 */
	public Player() {
		this.playerPostiion[0] = (int) Math.round(Math.random() * 10);
		this.playerPostiion[1] = (int) Math.round(Math.random() * 10);
	}

	/**
	 * @return returns an int list of with the {x, y} position of the player
	 */
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
