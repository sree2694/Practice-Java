
import java.util.Scanner;

public class Largestno {

	public static void main(String[] args) {
	    System.out.println("enter the number");//how many number you want to enter
	    Scanner scan = new Scanner(System.in);
	    int n1 = scan.nextInt();
	    int n2 = scan.nextInt();
	    int n3 = scan.nextInt();
	    int n4 = scan.nextInt();
	   System.out.println("largest no:" +largest(n1,n2,n3,n4));
	    
	}

	private static int largest(int n1, int n2, int n3, int n4) {
		int max = n1;
	    if (n2 > max)
	        max = n2;
	    if (n3 > max)
	        max = n3;
	    if (n4 > max)
	        max = n4;
	     return max;

	}

}
