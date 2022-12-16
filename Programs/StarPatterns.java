import java.util.Scanner;

public class StarPatterns {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printStars(n);
	}

	private static void printStars(int n) {
		// TODO Auto-generated method stub
		int rows = 5;
		for(int i = rows; i >= 1; --i) {
		    for(int j = 1; j <= i; ++j) {
		        System.out.print("* ");
		    }
		   System.out.println();
		}
	
	}
	

}