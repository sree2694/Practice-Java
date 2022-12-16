package Loops;

import java.util.Scanner;

public class ReverseNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num = 0, reversed = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		num = scan.nextInt();
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}

		System.out.println("Reverse of number : " + reversed);

	}

}
