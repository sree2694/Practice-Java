import java.util.Scanner;

public class Patterns {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printStars(n);
	}

	public static void printStars(int n) {
		int i, j;
		for (i = 1; i < n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
