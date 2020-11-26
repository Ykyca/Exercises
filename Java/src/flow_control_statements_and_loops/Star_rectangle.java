package flow_control_statements_and_loops;

public class Star_rectangle {

	public static void main(String[] args) {
		/*
		 * Koristi dve for petlje. Napisi program koji ispisuje graficki prikaz
		 * pravougaonika sastavljen od zvezdica
		 */

		int rows = 5;
		int columns = 10;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
