package exercises;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] ars) {
		// Napisi program koji ce ispisati n brojeva Fibonacijevog niza

		System.out.println("The program will show Fibonacci series.");
		System.out.println("Since it is infinite, please, provide a number of element the series will have: ");
		Scanner sc = new Scanner(System.in);
		int till = sc.nextInt();

		while (till <= 0) {
			System.out.println(
					"The Fibonacci or any other series should contain at least 2 numbers. Please, provide number greater than 1");
			till = sc.nextInt();
		}
		sc.close();

		int previousN = 0;
		int nextN = 1;

		for (int i = 1; i <= till; ++i) {
			System.out.print(previousN + ",  ");

			int sum = previousN + nextN;
			previousN = nextN;
			nextN = sum;
			/*
			 * On each iteration, we are assigning second number to the first number and
			 * assigning the sum of last two numbers to the second number
			 */
		}
	}
}