package Loops;

import java.util.Scanner;

public class Armstrong {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		checkarmstrong(n);

	}

	public static void checkarmstrong(int n) {
		int sum = 0, temp, remainder, digits = 0;
		temp = n;

		while (temp != 0) {
			digits++;
			temp = temp / 10;
		}

		temp = n;

		while (temp != 0) {
			remainder = temp % 10;
			sum = (int) (sum + Math.pow(remainder, digits));
			temp = temp / 10;
		}

		if (n == sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}

}
