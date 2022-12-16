package Loops;

import java.util.Scanner;

public class Multiplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Num");
		int N = scan.nextInt();
		mul(N);
	}

	public static void mul(int N) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + i * N);
		}

	}

}
