package flow_control_statements_and_loops;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		/*
		 * Write a program that will tell the user is is leap year or not based on the
		 * year he entered as input
		 */

		System.out.println("Please, enter a year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		boolean isLeap = false;

		while (year < 0) {
			System.out.println("The number you've provided is invalid. Please, enter number above 0");
			year = sc.nextInt();
		}
		sc.close();

		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			isLeap = true;
		} else {
			isLeap = false;
		}

		if (isLeap == true) {
			System.out.println("The year you've provided is a leap year");
		} else {
			System.out.println("The year you've provided is not a leap year");
		}

	}
}