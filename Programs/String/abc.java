package String;

import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = "";
		str = scan.nextLine();
		Character(str);
	}
	public static void Character(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i) == '-') {
		s += str.charAt(i);
		}
		}
		for (int j = 0; j < str.length(); j++) {
		if (str.charAt(j) != '-') {
		s += str.charAt(j);
		}
		}
		System.out.println(s);
		}
}
