package Loops;

import java.util.Scanner;

public class Palindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		palindrome(n);

	}

	public static void palindrome(int n) {
		int r, sum = 0, temp;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

}
