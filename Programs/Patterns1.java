import java.util.Scanner;

public class Patterns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printStars(n);
	}

	public static void printStars(int n) {
		int i, j, k = 0;
		for (i = 1; i < n; i++) {

			for (j = 1; j <= i; j++) {
				System.out.print(++k + " ");
			}
			System.out.println();
		}
	}

}


