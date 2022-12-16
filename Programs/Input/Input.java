package Input;

import java.util.Scanner;

public class Input {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Some number");
		int num = scan.nextInt();
		System.out.println("The entered value is" +num);
		
		System.out.println("Enter Some Decimal number");
		double d = scan.nextDouble();
		System.out.println("The entered value is" +num+ "Decimal number is:" +d );
		
		System.out.println("Enter Name");
		String str = scan.next();
		System.out.println("The entered value is" +str);
	
		
	
	}

}
