package ExceptionHandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		int a = 25;
		int b = 0;
		System.out.println((divide(a,b)));

	}

	private static int divide(int a, int b) {
		int res = 0;
		try {
			 res = a/b;
				
		}
		catch(ArithmeticException e) {
			//Error Messages of Exception
			//System.out.println("Don't divide by 0");
			//System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return res;
	}

}
