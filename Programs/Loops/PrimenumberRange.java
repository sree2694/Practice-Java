package Loops;

import java.util.Scanner;

public class PrimenumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter start number: ");
		int s1 = scan.nextInt();
		System.out.print("Enter End number: ");
		int s2 = scan.nextInt();
		primerange(s1, s2);
		System.out.println(primerange(s1, s2));
	}

	public static String primerange(int s1, int s2) {
		String result = "";
		int count = 0;
		for (int i = s1; i <= s2; i++) {
			count = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;

				}

			}
			if (count == 1)
				result+= i + " ";
		}
		return result;
	}
}