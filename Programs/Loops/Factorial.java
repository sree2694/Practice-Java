package Loops;

import java.util.Scanner;

public class Factorial {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = scan.nextInt();
		factorial(num);
	}

	public static int factorial(int num) {
		int i = 1, fact = 1;
		for (i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial is: " + fact);
		return 0;
	}

}
