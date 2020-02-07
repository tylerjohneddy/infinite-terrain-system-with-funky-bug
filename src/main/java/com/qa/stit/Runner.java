package com.qa.stit;

public class Runner {
	public static void main(String[] args) {
		Intrest intrestInstance = new Intrest();
		Calculations calc = new Calculations();
		Player player = new Player();
		Level level = new Level();

		boolean exit = true;
		int[] playerPostion = player.getPlayerPostiion();
		int[] intrest = intrestInstance.position();

		double distance = calc.distance(playerPostion, intrest);
		while(exit) {
			level.levelDiscriptor();
		while (distance != 0.0 && exit) {
			System.out.printf("playerx=%s,playerY=%s,intrestX=%s,intrestY=%s%n", playerPostion[0], playerPostion[1],
					intrest[0], intrest[1]);
			System.out.printf("The compass reads\n\t%.2fm\n", (float) distance);
			System.out.println("Which direction do you want to go?");


			Directions direction = Directions.getDirection();

			switch (direction) {
			case NORTH:
				player.setPlayerX(player.getPlayerPostiion()[0] + 1);
				break;
			case EAST:
				player.setPlayerY(player.getPlayerPostiion()[1] + 1);
				break;
			case SOUTH:

				player.setPlayerX(player.getPlayerPostiion()[0] - 1);
				break;
			case WEST:
				player.setPlayerY(player.getPlayerPostiion()[1] - 1);
				break;
			case EXIT:
				exit = false;
				distance = 0.0;
				break;

			default:
				break;
			}
			distance = calc.distance(playerPostion, intrest);

		}
		if (exit) {
			level.rewardDiscriptor();
			intrest = intrestInstance.position();
			

		} else {
			System.out.println("Thanks for playing, see you soon!");
		}

	}
	}
}
