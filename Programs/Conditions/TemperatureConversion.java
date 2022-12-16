package Conditions;

import java.util.Scanner;

public class TemperatureConversion {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ch = 0;
		double temp = 0;
		System.out.println(" 0 - Farhenheit to Celsius.\n 1- Celsius to Farhenheit.");
		System.out.println("Enter Temperature");
		ch = scan.nextInt();
		temp = scan.nextDouble();
		calctemp(ch, temp);
	}

	public static void calctemp(int ch, double temp) {
		switch (ch) {
		case 0:
			temp = (((temp - 32) * 5) / 9);
			System.out.println("The Farhenheit to Celsius is" + temp);
			break;
		case 1:
			temp = temp * 1.8 + 32;
			System.out.println("The Celsius to Farhenheit is" + temp);
			break;
		default:
			System.out.println("Entered Wroung choice");
		}

		return;
	}
}