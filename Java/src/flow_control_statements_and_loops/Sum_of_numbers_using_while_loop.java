package flow_control_statements_and_loops;

import java.util.Scanner;

public class Sum_of_numbers_using_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj. Kad je unesen negativan broj, treba da bude ispisan zbir svih
		 * pozitibvnih brojeva koji su uneseni do tada. Ako se unesu: 1,1,5,-100,
		 * program treba da izbaci 7
		 */

		System.out.println("Please, enter a positive number: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int sum = 0;
		while (x >= 0) {
			sum = sum + x;
			System.out.println("Please, enter a positive number: ");
			x = sc.nextInt();
		}

		System.out.println("The sum of the positive numbers you've entered so far is: " + sum);

		sc.close();
	}

}
