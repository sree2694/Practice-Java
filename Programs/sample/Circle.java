package sample;

import java.util.Scanner;

public class Circle {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		float r = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius");
		r = scan.nextFloat();
		area(r);
		System.out.println("Area of circle" + area(r));
		perimeter(r);
		System.out.println("Area of perimeter" + perimeter(r));

	}

	public static float perimeter(float r) {
		double pi = 3.14;
		return (float) (2 * pi * r);

	}

	public static float area(float r) {

		double pi = 3.14;
		return (float) (pi * r * r);

	}

}
