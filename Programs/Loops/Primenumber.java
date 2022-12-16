package Loops;

import java.util.Scanner;

public class Primenumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		primenumber(num);

	}

	public static void primenumber(int num) {

		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.print(+num + " is prime number");
		} else {
			System.out.print(+num + " is not  prime number");
		}
	}
}
