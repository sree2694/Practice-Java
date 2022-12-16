package Interface;

import java.util.Scanner;

public class CalculateBillAmount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int units = 0;
		int choice =0;
		while (true) {
			System.out.println("1.WaterBill\n2.ElectricityBill\n3.Exit");
			System.out.println("Enter Choice");
			choice = scan.nextInt();

			if (choice == 1) {
				System.out.println("Enter No.of Litres");
				units = scan.nextInt();
				
				WBill w1 = new WBill(units);
				w1.displayBill();
			} else if (choice == 2) {
				System.out.println("Enter No.of units");
				units = scan.nextInt();
				Electricity e1 = new Electricity(units);
				e1.displayBill();

			} else if (choice == 3) {
				System.out.println("Exiting...");
				break;
			} else {
				System.out.println("Invalid Choice...!");
			}
		}
	}
}
