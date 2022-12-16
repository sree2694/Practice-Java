package String;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String str ="";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter String");
		str = scan.nextLine();
		int length = str.length();

		palindrome(str);
		
	}

	public static void palindrome(String str) {
		String reverse = "";
		for(int i = str.length()-1; i>=0;i--) {
			reverse = reverse + str.charAt(i);	
	}
		if(str.equals(reverse)) {
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome"+reverse);
		}
		
	}

}
