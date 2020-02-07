package com.qa.stit;

public class Level {
	private int level = 1;

	public void levelDiscriptor() {

		switch (this.level) {

		case 1:
			System.out.println("Grey foggy clouds float oppressively close to you, \r\n"
					+ "reflected in the murky grey water which reaches up your shins.\r\n"
					+ "Some black plants barely poke out of the shallow water.\r\n"
					+ "Try \"north\", \"south\", \"east\", or \"west\"\r\n"
					+ "You notice a small watch-like device in your left hand.  \r\n"
					+ "It has hands like a watch, but the hands don't seem to tell time. \r\n" + "");
			break;

		default:
			System.out.println("The number on the watch has changed, Will it ever lead me out of this swamp?");
			break;
		}
	}

	public void rewardDiscriptor() {

		switch (this.level) {

		case 1:
			System.out.println(
					"The number on the watch has reached 0, it has led me to a chest....\nInside the chest is a manual with a picture of the watch on it, all the pages are wet and i can only make out one thing...\n\n The watch will lead you home...");
			break;
		default:
			System.out.println(
					"Theres nothing here, where is it taking me? is this the safest way out maybe? feel like its just taking me deeper in to the swamp");
			break;
		}
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
