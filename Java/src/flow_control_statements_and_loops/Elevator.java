package flow_control_statements_and_loops;

import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) {
		/*
		 * Lift je nosivosti 720kg. Napisati program koji proverava da li ce lift
		 * bezbedno krenuti u zavisnostii od tezine koju treba da ponese. Podrazumevane
		 * 3 opcije: Lift je preopterecen; Na granici je; Lift je pokrenut
		 */

		System.out.println("Please, enter the weight that's in elevator, in kg:");
		Scanner sc = new Scanner(System.in);

		double current_weight = sc.nextDouble();
		double max_weight = 720;

		if (current_weight > max_weight) {
			System.out.println(
					"The elevator is overloaded. It is not safe to use the elevator. Please, remove some weight!");
		} else if (current_weight == max_weight) {
			System.out.println(
					"The elevator has reached its maximum weight. You can use it on your own responsability. Press 1 for Yes and press 2 for No");
			int decision = sc.nextInt();
			switch (decision) {
			case 1:
				System.out.println("Elevator will start in 3 seconds");
				break;
			case 2:
				System.out.println("Elevator will not start. Please, remove some weight");
				break;
			default:
				System.out.println("Invalid data. Please, select 1 or 2.");
			}
		} else if (current_weight == 0 || current_weight < 0) {
			System.out.println("Elevator is empty. Please, add some weight");
		} else if (current_weight < max_weight && current_weight > 0) {
			System.out.println("Elevator will start in 3 seconds");
		} else {
			System.out.println("Elevator is out of order");
		}

		sc.close();
	}

}
