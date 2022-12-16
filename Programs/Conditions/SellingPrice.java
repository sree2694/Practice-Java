package Conditions;

import java.util.Scanner;

public class SellingPrice {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter price of an item");
		int price = scan.nextInt();
		discount(price);

	}

	public static void discount(double price) {
		if (price >= 0 && price <= 10000) {
			double discount = price * 0.9;

			System.out.println("Selling price after discount : " + discount);
		} else if (price >= 10000 && price <= 20000) {
			double discount = price * 0.8;
			System.out.println("Selling price after discount : " + discount);
		} else {
			double discount = price * 0.75;
			System.out.println("Selling price after discount : " + discount);
		}
	}
}