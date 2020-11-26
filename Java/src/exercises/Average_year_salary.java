package exercises;

import java.util.Scanner;

public class Average_year_salary {

	public static void main(String[] args) {
		/*
		 * Make a java program that will allow user to enter his salaries in latest 12
		 * months and show user's average year salary.
		 */

		System.out.println(
				"In order to calculate your year average salary, you will need to enter salary for each month.");
		Scanner sc = new Scanner(System.in);
		double ySalary = 0;
		double averageYsalary = 0;

		for (int i = 1; i <= 12; i++) {

			System.out.println("Please, enter salary for the " + i + ". month in EUR: ");
			double mSalary = sc.nextDouble();

			while (mSalary <= 0) {
				System.out.println("Monthly salary cannot be 0 or less. Please, enter data again: ");
				mSalary = sc.nextDouble();
			}

			ySalary = ySalary + mSalary;

		}
		sc.close();

		averageYsalary = ySalary / 12;
		System.out.println("Your average year salary is: " + averageYsalary + " euros");

	}

}
