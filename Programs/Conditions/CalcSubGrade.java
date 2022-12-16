package Conditions;

import java.util.Scanner;

public class CalcSubGrade {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 Subject Marks: ");
		int sub1 = scan.nextInt();
		int sub2 = scan.nextInt();
		int sub3 = scan.nextInt();
		grade(sub1, sub2, sub3);
	}

	public static void grade(double sub1, double sub2, double sub3) {
		double tot = sub1 + sub2 + sub3;
		double percentage = (tot / 300) * 100;
		if (percentage >= 90) {
			System.out.println("Grade = A");
		} else if (percentage >= 70 && percentage < 90) {
			System.out.println("Grade = B");
		} else if (percentage >= 50 && percentage < 70) {
			System.out.println("Grade = C");
		} else if (percentage < 50) {
			System.out.println("Grade = F");

		}

	}

}
