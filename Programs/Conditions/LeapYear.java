package Conditions;

import java.util.Scanner;

public class LeapYear {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year;
		System.out.println("Enter a year: ");
		year = scan.nextInt();
		System.out.println("Leap year: " + isleapyear(year));

	}

	private static boolean isleapyear(int year) {
		if (year % 100 == 0 && year % 400 == 0)
			return true;
		else if (year % 4 == 0 && year % 100 != 0)
			return true;
		else
			return false;

	}
}
