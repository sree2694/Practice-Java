package Loops;

import java.util.Scanner;

public class SecondMaxDigit {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = scan.nextInt();
		SecondMax(num);

	}

	public static void SecondMax(int num) {
		int max1 = 0, max2 = 0, digit = 0;
		while (num > 0) {
			digit = num % 10;
			if (max1 < digit) {
				max2 = max1;
				max1 = digit;
			} else if (max2 < digit) {
				if (max1 != digit)
					max2 = digit;

			}
			num = num / 10;
		}
		System.out.println("First max :" + max1 + " Second max :" + max2);
	}

}
