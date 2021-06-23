import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please enter values as following:\n" +
				"No. of entries as integer\n" +
				"Quantities and prices separated by space as doubles, one pair for each line\r");

		Scanner sc = new Scanner(System.in);
		int entries = sc.nextInt();
		sc.nextLine();
		double[][] purchases = new double[entries][2];

		int index = 0;
		while(entries > 0) {
			String input = sc.nextLine();
			String[] nums = input.split(" ");
			purchases[index][0] = Double.parseDouble(nums[0]);
			purchases[index][1] = Double.parseDouble(nums[1]);
			index++;
			entries--;
		}
		sc.close();
		
		double totalQuantity = 0.0;
		double sum = 0.0;
		for(int i=0; i<purchases.length; i++) {
			totalQuantity += purchases[i][0];
			sum += purchases[i][0] * purchases[i][1];
		}
		
		System.out.println("Quantity: " + totalQuantity);
		System.out.println("Average price: " + (sum/totalQuantity) + " USD");
		System.out.println("Total value: " + sum + " USD");
	}
}
