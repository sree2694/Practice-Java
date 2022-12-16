package Conditions;

import java.util.Scanner;

public class greatest_num {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Enter three numbers:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		System.out.println("Greatest no is: " + greatestnum(num1, num2, num3));
	}

	private static int greatestnum(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num3) {
			return num2;
		} else {
			return num3;
		}

	}
	/*
	 * private static int greatestnum(int num1, int num2, int num3) { int max =
	 * num1; if (num2 > max) { max = num2; } if (num3 > max) { max = num3; } return
	 * max; }
	 * 
	 * }
	 * 
	 */
}
