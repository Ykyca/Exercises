package flow_control_statements_and_loops;

import java.util.Scanner;

public class Backward_count_while_loop {

	public static void main(String[] args) {
		/*
		 * Write a program that will ask for a number. Program will display backward
		 * count from the provided number to zero. For example, enter number 6, the
		 * program should writ 6, 5, 4, 3, 2, 1, 0
		 */

		System.out.println("Please, enter number for backward count");
		Scanner sc = new Scanner(System.in);

		int startNumber = sc.nextInt();

		do {
			System.out.print(startNumber + ", ");
			startNumber--;
		} while (startNumber >= 0);

		sc.close();
	}

}
