package card_game;

import java.util.Scanner;

public class Game_rules {
	/*
	 * Napravi metode: -ucitavanje karata jednog igraca (celi brojevi; sthovi su
	 * 10-14): pitati igraca koliko ima karata i koje su to karte -koja broji koliko
	 * stihova ima korisnik: svaki stih se broji kao 1 -koja ce reci ko je pobednik
	 * u tablicu
	 */
	Scanner sc = new Scanner(System.in);
	public int n;
	public int stih = 0;
	public int[] karte;

	public int[] sakupljeneKarte() {
		System.out.println("Koliko si sakupio karata: ");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.println("Broj karata mora biti veci od nula. Upisite ponovo");
			n = sc.nextInt();
		}

		karte = new int[n];

		System.out.println("Upisi sve karte koje si sakupio: ");
		for (int i = 0; i < karte.length; i++) {
			int karta = sc.nextInt();
			while (karta < 1 || karta > 14) {
				System.out.println("Karta je neispravna. Upisite kartu opet");
				karta = sc.nextInt();
			}
			karte[i] = karta;
		}
		System.out.println("Karte upisane");
		return karte;

	}

	public int kolikoStihova() {
		sakupljeneKarte();
		for (int i = 0; i < karte.length; i++) {
			if (karte[i] == 10 || karte[i] == 11 || karte[i] == 12 || karte[i] == 13 || karte[i] == 14) {
				stih = stih + 1;
			}
		}
		System.out.println("Broj stihova je: " + stih);
		return stih;

	}

	public void koJePobednik() {
		int a = kolikoStihova();
		stih = 0;
		int b = kolikoStihova();

		if (a > b) {
			System.out.println("Igrac broj 1 je pobednik");
		} else if (a < b) {
			System.out.println("Igrac broj 2 je pobednik");
		} else {
			System.out.println("Rezultat je izjednacen");
		}

		sc.close();
	}

}
