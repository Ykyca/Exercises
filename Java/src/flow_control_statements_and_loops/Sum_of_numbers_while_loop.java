package flow_control_statements_and_loops;

public class Sum_of_numbers_while_loop {

	public static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		/*
		 * Write a Java program to compute the sum of the first 100 even numbers
		 */

		int start = 0;
		int sum = 0;

		while (start <= 22) {
			start++;
			if (isEven(start)) {
				sum = sum + start;
			}
		}
		System.out.println("Sum of even numbers from 1 to 100 is: " + sum);
	}

}
