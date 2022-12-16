package Loops;

import java.util.Scanner;

public class Divisible3by5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Range");
		int min_num = scan.nextInt();
		int max_num = scan.nextInt();
		Divisible(min_num, max_num);

	}

	public static void Divisible(int min_num, int max_num) {
		int sum = 0;
		for (int i = min_num; i <= max_num; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum = sum + i;
		}
		System.out.println("Output is : " + sum);
	}

}
