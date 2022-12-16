package sample;

import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		int num1=0,num2=0, result=0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		result = add(num1,num2);
		System.out.println("Sum of number is :"+result);
		result = sub(num1,num2);
		/*System.out.println("Sum of number is :"+add(num1,num2));*/
		System.out.println("Sub of number is :"+result);
		/*System.out.println("Sum of number is :"+sub(num1,num2));*/
		result = mult(num1,num2);
		System.out.println("Multiplication of number is :"+result);
		/*System.out.println("Sum of number is :"+mult(num1,num2));*/
		result = div(num1,num2);
		System.out.println("Division of number is :"+result);
		/*System.out.println("Sum of number is :"+div(num1,num2));*/

	}
public static int div(int num1, int num2) {
	int result;
	result = num1 / num2;
	return result;
	}
public static int mult(int num1, int num2) {
	int result;
	result = num1 * num2;
	return result;

	}
public static int sub(int num1, int num2) {
		
	int result;
	result = num1 - num2;
	return result;
	}
public static int add(int num1, int num2) {
	int result;
	result = num1 + num2;
	return result ;
	
}
}
