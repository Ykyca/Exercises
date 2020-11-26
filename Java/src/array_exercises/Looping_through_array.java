package array_exercises;

import java.util.Scanner;

public class Looping_through_array {

	public static void main(String[] args) {
		/*
		 * Let user make an array with int values he wants. Let him enter a divisor.
		 * Program should write in a console a new array of numbers that contains
		 * numbers that can be divided by the entered divisor.
		 */

		System.out.println("How many places will your array take?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
        // while pisem pre inicijalizacije niza, kako mi program ne bi bio pukao zbog izuzetka za negativnu duzinu niza
        while (n <= 0) {
            System.out.println("An array has to have at least 1 place. Please, provide the number again: ");
            n = sc.nextInt();
        }
		
		int userArr[] = new int[n];

		boolean isDivided = false;
		System.out.println("Please, enter a value that will be used as a divisor:");
		int divisor = sc.nextInt();

		System.out.println("Plase, enter values for the array");
		for (int i = 0; i < userArr.length; i++) {
			userArr[i] = sc.nextInt();
		}

		System.out.println("Numbers from the initial array that can be devided with the provided number are: ");
		for (int i = 0; i < userArr.length; i++) {
			if (userArr[i] % divisor == 0) {
				isDivided = true;
			} else {
				isDivided = false;
			}
			if (isDivided == true) {
				System.out.print(userArr[i] + "  ");
			}
		}

		sc.close();
	}
}
