package String;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		System.out.println("Enter Name");
		str = scan.nextLine();
		
		//	String str = "talent sprint";
		System.out.println(reverse(str));

	}

	public static String reverse(String str) {
		String reverseword = "";
		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length() - 1; j >= 0; --j) {
				reverseword += arr[i].charAt(j);
			}
			reverseword += " ";
		}
		return reverseword;

	}

}
