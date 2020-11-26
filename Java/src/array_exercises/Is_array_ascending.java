package array_exercises;

import java.util.Scanner;

public class Is_array_ascending {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je uneti niz
		 * rastuci ili ne. Primer niz1: 100 222 333 5123--> Konzola: Niz je rastuci.
		 * niz2: 66 4 777 11 999--> Konzola: Niz nije rastuci.
		 */

		System.out.println("Unesite broj mesta za niz: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// while pisem pre inicijalizacije niza, kako mi program ne bi bio pukao zbog
		// izuzetka za negativnu duzinu niza
		while (n <= 0) {
			System.out.println("Broj elemenata niza ne moze biti 0, niti negativan broj. Ponovo unesite duzinu niza");
			n = sc.nextInt();
		}
		int userArray[] = new int[n];

		System.out.println("Unesite clanove niza");
		for (int i = 0; i < userArray.length; i++) {
			userArray[i] = sc.nextInt();
		}

		boolean isAscending = false;

		for (int i = 0; i < userArray.length - 1; i++) {
			if (userArray[i] < userArray[i + 1]) {
				isAscending = true;
			} else {
				isAscending = false;
			}

		}

		if (isAscending == true) {
			System.out.println("Niz je rastuci");
		} else {
			System.out.println("Niz nije rastuci");
		}

		sc.close();

	}

}
