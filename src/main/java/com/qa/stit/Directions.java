package com.qa.stit;

public enum Directions {
	NORTH,
	EAST,
	SOUTH,
	WEST,
	EXIT;
	
	public static void printDirections() {
		for (Directions direction : Directions.values()) {
			System.out.println(direction.name());
		}
	}
	public static Directions getDirection() {
		Directions direction;
		while (true) {
			try {
				direction = Directions.valueOf(Util.getInput().toUpperCase());
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid selection please try again.");
				System.out.println("Valid options");
				printDirections();
				
			}
		}
		return direction;
	}

}
