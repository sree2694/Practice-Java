package sample;

import java.util.Scanner;

public class AddNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		z = x+y;
		System.out.println(+z);
	}

}
