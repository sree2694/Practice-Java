package sample;

import java.util.Scanner;

public class SumAndDifference {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, a, b, sum, diff;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		a = num%10;
		b = num/10;
		
		sum = a + b;
		diff = b - a;
        System.out.println("sum of digits "+a+" "+b+"is"+sum);
        System.out.println("Difference of digits:"+diff);

	}

}

        