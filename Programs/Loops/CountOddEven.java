package Loops;

import java.util.Scanner;

public class CountOddEven {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = countEvenOdd(n);

	}

	public static int countEvenOdd(int n) {
		int even_count = 0;
		int odd_count = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0)
				even_count++;
			else
				odd_count++;
			n = n / 10;
		}
		System.out.println("Even number of digits  :" + even_count);
		System.out.println("Odd number of digits  :" + odd_count);
		return odd_count;
	}

}
