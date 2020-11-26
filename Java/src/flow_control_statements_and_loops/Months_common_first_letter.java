package flow_control_statements_and_loops;

import java.util.Scanner;

public class Months_common_first_letter {

	public static void main(String[] args) {
		/*
		 * Koristi switch. Napisi program koji na osnovu unetog meseca daje informaciju
		 * koliko ukupno meseci ima u godini koji pocinju na to isto slovo (kao i uneti
		 * mesec)
		 */

		System.out.println("Please, enter a name of a month:");
		Scanner sc = new Scanner(System.in);

		String month = sc.next();
		String monthToCaps = month.toUpperCase();

		switch (monthToCaps) {
		case "JANUARY":
		case "JUNE":
		case "JULY":
			System.out.println("Number of months that starts with a letter from the provided month are 3.");
			break;
		case "MARCH":
		case "APRIL":
		case "MAY":
		case "AUGUST":
			System.out.println("Number of months that starts with a letter from the provided month are 2.");
			break;
		case "FEBRUARY":
		case "SEPTEMBER":
		case "OCTOBER":
		case "NOVEMBER":
		case "DECEMBER":
			System.out.println("Number of months that starts with a letter from the provided month is 1.");
			break;
		default:
			System.out.println("Month doesn't exist. Please, check your spelling.");
		}

		sc.close();

	}

}
