package String;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		String name = "", firstname, lastname;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name");
		name = scan.nextLine();
		System.out.println(name);
		int index = name.indexOf(" ");
		firstname = name.substring(0, index);
		lastname = name.substring(index);
		System.out.println("Firstname: " + firstname);
		System.out.println("Lastname: " + lastname);

	}

}
