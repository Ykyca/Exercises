package array_exercises;

import java.util.Scanner;

public class Show_array_inversal_order {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		 * redosledom. Primer niza: 10 44 222 18 Ispis: 18 222 44 10
		 */

		System.out.println("How many places you want your array to have?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int userArray[] = new int[n];

		while (n <= 0) {
			System.out.println(
					"An array has to contain at least one number. Please, enter the value again. Value has to be 1 or above: ");
			n = sc.nextInt();
		}

		for (int i = 0; i < userArray.length; i++) {
			System.out.println("Please, fill in the " + (i + 1) + ". place of the array: ");
			userArray[i] = sc.nextInt();
		}

		System.out.println("The array in the inversal order is: ");
		for (int i = userArray.length - 1; i >= 0; i--) {
			System.out.println(userArray[i]);
		}
		sc.close();
	}

}
