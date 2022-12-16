package sample;

import java.util.*;

public class Average {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y,z;
		double avg;
		System.out.println("Enter three numbers");
		Scanner scan = new Scanner(System.in);
		x = scan.nextDouble();
		y = scan.nextDouble();
		z = scan.nextDouble();
		avg = (x+y+z)/3;
		System.out.println("Average of numbers is:" +avg);

	}

}
