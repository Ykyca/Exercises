package basics;

import java.util.Scanner;

public class Arrays_with_for_loop {

	public static void main(String[] args) {
		/*
		 * Make an array with n number of places that is provided by the user. Let user
		 * insert values for the array. Write the inserted array in a line
		 */

		System.out.println("How many places your array contains?");
		Scanner sc = new Scanner(System.in);
		int nPlaces = sc.nextInt();

		int userArray[] = new int[nPlaces];

		for (int i = 0; i < userArray.length; i++) {
			System.out.println("Please, enter a value for " + (i + 1) + ". place in the array");
			userArray[i] = sc.nextInt();
		}

		System.out.println("The array you've provided is: ");
		for (int i = 0; i < userArray.length; i++) {
			System.out.print(userArray[i] + "  ");
		}

		sc.close();
	}

}
