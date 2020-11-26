package array_exercises;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce na standarnom izlazu ispisati poruku "Niz je
		 * palindrom" ili "Niz nije palindrom" (u zavisnosti da li niz jeste ili nije
		 * palindrom).
		 */

		System.out.println("Please, provide how many places will your array have: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// while pisem pre inicijalizacije niza, kako mi program ne bi bio pukao zbog
		// izuzetka za negativnu duzinu niza
		while (n <= 0) {
			System.out.println(
					"An array has to contain at least one number. Please, enter the value again. Value has to be 1 or above: ");
			n = sc.nextInt();
		}
		int userArray[] = new int[n];

		for (int i = 0; i < userArray.length; i++) {
			System.out.println("Please, provide the " + (i + 1) + ". place of the array: ");
			userArray[i] = sc.nextInt();
		}

		boolean isPalindrome = false;

		for (int i = 0; i < userArray.length / 2; i++) {
			if (userArray[i] == userArray[userArray.length - 1 - i]) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
			}
		}
		if (isPalindrome == true) {
			System.out.println("The array you have provided is a palindrome");
		} else {
			System.out.println("The array you have provided is not a palindrome");
		}
		sc.close();
	}

}
