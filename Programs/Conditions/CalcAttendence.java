package Conditions;

import java.util.Scanner;

public class CalcAttendence {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double classesheld;
		double classattend;
		System.out.println("Enter No.of Classes held:");
		System.out.println("Enter No.of Classes attended:");
		classesheld = scan.nextInt();
		classattend = scan.nextInt();
		attendence(classesheld, classattend);

	}

	private static void attendence(double classesheld, double classattend) {
		double percentage = (classattend / classesheld) * 100;
		if (percentage >= 75) {
			System.out.println("Your Percentage is above 75, allowed to exam");
		} else {
			System.out.println("Your Percentage is not above 75, not allowed to exam");
		}

	}

}
