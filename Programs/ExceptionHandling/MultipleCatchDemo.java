package ExceptionHandling;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		int arr[] = new int[10];
		String s = null;
		try {
			//s.trim();
			arr[10] = 12 / 20;

		} // Error Messages of Exception
		catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally...");
		}

		System.out.println("Rest of code");
	}

}
