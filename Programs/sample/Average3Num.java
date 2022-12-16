package sample;

import java.util.Scanner;

public class Average3Num {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double num1 = 0, num2 = 0, num3 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Three no");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		System.out.println("Average of three num" + Avg(num1, num2, num3));
		// TODO Auto-generated method stub
	}

	public static double Avg(double num1, double num2, double num3) {

		return (double) (num1 * num2 * num3 / 3);
	}

}
