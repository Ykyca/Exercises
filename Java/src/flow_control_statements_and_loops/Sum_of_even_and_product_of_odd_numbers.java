package flow_control_statements_and_loops;

import java.util.Scanner;

public class Sum_of_even_and_product_of_odd_numbers {

	public static void main(String[] args) {
		/*
		 * Napisi program koji ce da izracuna sumu parnih brojeva i proizvod neparnih
		 * brojeva u odredjenom rasponu. Raspon ce biti od 0 no broja koji korisnik
		 * unese, ukljucujuci i taj broj
		 */

		System.out.println(
				"Please, provide a nuber in order to generate the sum of all even numbers and product of all odd numbers in the range from 0 to that number:");
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int sum = 0;
		int product = 1;

		for (int i = 1; i <= x; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			} else {
				product = product * i;
			}
		}

		System.out.println("The sum of all even numbers in the range is: " + sum);
		System.out.println("Product of all odd numbers in the range is: " + product);

		sc.close();

	}

}
