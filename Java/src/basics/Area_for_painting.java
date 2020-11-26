package basics;

import java.util.Scanner;

public class Area_for_painting {

	public static void main(String[] args) {
		/*
		 *Napisati program koji racuna P okrecene prostorije tako sto ce se ivice
		 *prostorije ucitavati preko konzole. 
		 *Zidovi su oblika pravougaonika, nema prozora, a ni vrata 
		 */
		
		System.out.println("Please, provide the lenght of the longer wall in metres:");
		Scanner sc = new Scanner(System.in);
		float length_longer_wall=sc.nextFloat();
		System.out.println("Please, provide the lenght of the shorter wall in metres:");
		float length_shorter_wall=sc.nextFloat();
		System.out.println("Please, provide the heights of the walls in metres:");
		float heights=sc.nextFloat();
		
		float area_wall_one=length_longer_wall*heights;
		float area_wall_two=length_shorter_wall*heights;
		float area_ceiling=length_longer_wall*length_shorter_wall;
		
		float area_for_painting = (area_wall_one + area_wall_two) * 2 + area_ceiling;
		
		System.out.println("The entire area for painting is: " + area_for_painting + "sq m");

		sc.close();
	}
	

}
