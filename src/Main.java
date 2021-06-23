import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please enter values as following:\n" +
				"No. of entries as integer\n" +
				"Quantities and prices separated by space as doubles, one pair for each line\r");

		Scanner sc = new Scanner(System.in);
		int entries = sc.nextInt();
		sc.nextLine();
		double[][] purchases = new double[entries][2];
		System.out.println("enties is: " + entries);

		int index = 0;
		while(entries > 0) {
			String input = sc.nextLine();
			String[] nums = input.split(" ");
			System.out.println("Nums are " + nums[0] + " and " + nums[1]);
			purchases[index][0] = Double.parseDouble(nums[0]);
			purchases[index][1] = Double.parseDouble(nums[1]);
			index++;
			entries--;
		}
		sc.close();

		for(int i=0; i<purchases.length; i++) {
			System.out.println(purchases[i][0] + " for " + purchases[i][1] + " USD");
		}

	}
}
