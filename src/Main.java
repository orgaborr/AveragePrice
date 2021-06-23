import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please enter values as following:\n" +
						   "No. of entries as integer" +
						   "Quantities and prices separated by space as doubles, one pair for each line");
		
		try(Scanner sc = new Scanner(System.in)) {
			int entries = sc.nextInt();
			double[][] purchases = new double[entries][2];
			
			int index = 0;
			while(entries != 0) {
				purchases[index][0] = sc.nextDouble();
				purchases[index][1] = sc.nextDouble();
				index++;
				entries--;
			}
			
			for(int i=0; i<purchases.length; i++) {
				System.out.println(purchases[i][0] + " for " + purchases[i][1] + " USD");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	double average(double quantity, double price) {
		return quantity*price;
	}	
}
