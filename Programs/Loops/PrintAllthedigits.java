package Loops;

import java.util.Scanner;

public class PrintAllthedigits {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int digit = 0, num = 0;

		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		System.out.println("Digits in number :");
		while (num > 0) {
			digit = num % 10;
			System.out.println(digit);
			num = num / 10;
		}

	}

}
