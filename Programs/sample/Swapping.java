package sample;

import java.util.Scanner;

public class Swapping {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int num1, num2, temp;
		   Scanner scan = new Scanner(System.in);
		   System.out.println("input :");
		   num1 = scan.nextInt();
		   num2 = scan.nextInt();

		   System.out.println("Before Swapping");
		   System.out.println("num1 = "+num1);
		   System.out.println("num2 = "+num2);
		   temp = num1;
		   num1 = num2;
		   num2 = temp;
		   System.out.println("After Swapping");
		   System.out.println("num1 = "+num1);
		   System.out.println("num2 = "+num2);

	}

}

