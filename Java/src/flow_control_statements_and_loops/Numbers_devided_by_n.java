package flow_control_statements_and_loops;

public class Numbers_devided_by_n {

	public static void main(String[] args) {
		/*
		 * Napisi program koji ce prebrojati koliko je brojeva deljivo sa brojem 3
		 * pocevsi od broja 3 do broja 300
		 */

		int start = 3;
		int end = 300;
		int result = 0;

		for (int i = start; i <= end; i++) {
			if (i % 3 == 0) {
				result = result + 1;
			}
		}

		System.out.println("Number of numbers that can be devided in the 3 - 300 range is: " + result);

	}

}
