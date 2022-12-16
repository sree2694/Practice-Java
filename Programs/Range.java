import java.util.Scanner;

public class Range {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n1, n2, step = 0;
		System.out.println("Enter two Arguments");
		n1 = scan.nextInt();
		n2 = scan.nextInt();

		System.out.print(printRange(n1, n2, step));
	}

	public static int printRange(int num1, int num2, int step) {

		if (num1 >= num2) {
			System.out.print("Enter greater second value");
		} else if (num1 < num2) {
			step = ++num2;
		} else if (num1 == num2) {
			return 0;
		}

		return step;
	}
}
