package ExceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		int age = 10;
		ageValidation(age);
		System.out.println("Hi Voter");
	}

	private static void ageValidation(int age) {
		// TODO Auto-generated method stub
		if(age>=18)
			System.out.println("Welcome to voter System");
		else
			throw new ArithmeticException();
	}

}
