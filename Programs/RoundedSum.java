import java.util.Scanner;

public class RoundedSum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2, n3;

		System.out.println("Enter three numbers:");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();

		sumOfRoundedValues(n1, n2, n3);
		System.out.println(sumOfRoundedValues(n1, n2, n3));
	}

	private static int sumOfRoundedValues(int n1, int n2, int n3) {
		if (n1 > 0 && n2 > 0 && n3 > 0) {
			int a = n1 % 10;
			if (a >= 5 && a <= 9) {
				n1 = ((n1 / 10) * 10) + 10;
			} else {
				n1 = ((n1 / 10) * 10);
			}
			int b = n2 % 10;
			if (b >= 5 && b <= 9) {
				n2 = ((n2 / 10) * 10) + 10;
			} else {
				n2 = ((n2 / 10) * 10);
			}
			int c = n3 % 10;
			if (c >= 5 && c <= 9) {
				n3 = ((n3 / 10) * 10) + 10;
			} else {
				n3 = ((n3 / 10) * 10);
			}
			return (n1 + n2 + n3);

		} else
			return (-1);
	}

}
