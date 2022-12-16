package Loops;

import java.util.Scanner;

public class SumOfEvenNaturalNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int sum = 0, num = 0, i = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Even numbers");
		num = scan.nextInt();
		i = 1;
		while (i <= num) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println(+sum);
	}
}
