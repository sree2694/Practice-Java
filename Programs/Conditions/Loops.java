package Conditions;

public class Loops {

	public static void main(String[] args) {
		int age = 60;
		if (age > 90) {
			System.out.println("Your age is Greater than 90");
		} else if (age > 50 && age < 90) {
			System.out.println("Your age is between 50 and 90");
		} else {
			System.out.println("Your age is less than 50");
		}
	}

}
