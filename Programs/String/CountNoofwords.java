package String;

import java.util.Scanner;

public class CountNoofwords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "";
		System.out.println("Enter Name");
		str = scan.nextLine();
		System.out.println("Total count is :"+CountWords(str));
	}

	public static int CountWords(String str) {
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		return arr.length;
	}

}
