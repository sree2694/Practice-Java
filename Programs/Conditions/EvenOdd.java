package Conditions;

import java.util.Scanner;

public class EvenOdd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter a number: ");
		num = scan.nextInt();
		System.out.println(num + "is even" + isevenOdd(num));

	}

	public static boolean isevenOdd(int num) {
		if (num % 2 == 0)
			return true;
		else
			return false;

	}
}
