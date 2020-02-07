package com.qa.stit;

import java.util.Scanner;

/**
 * 
 * @author Tyler
 *
 *
 */
public class Util {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * @return
	 * This class is used for taking user input from the console and return the string.
	 */
	static String getInput() {
		return scanner.nextLine();
	}

}
