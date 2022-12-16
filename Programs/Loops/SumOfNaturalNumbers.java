package Loops;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int mul = 1, num = 10, i = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers");
		num = scan.nextInt();
		while (i <= num) {
			mul = mul * i;
			i++;
		}
		System.out.println(+mul);
	}

}
