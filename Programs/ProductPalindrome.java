
import java.util.Scanner;

public class ProductPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.print("Next Palindrome is:"+NextPalindrome(n)); 

	}

	private static int NextPalindrome(int N) {
	int x,y;

	    if (8 <= N && N <= 11) 
	        return 11; 
	  

	    for (x = 1; x < 100000; ++x) { 
	      
	        String s = Integer.toString(x); 
	        StringBuffer buffer = new StringBuffer(s); 
	        buffer.reverse(); 
	          
	        y = Integer.parseInt(s + buffer.substring(1).toString()); 
 
	        if (y >= N && isPrime(y) == true) 
	            return y; 
	    } 
	  
	    return -1; 
	}

	private static boolean isPrime(int num) {
		 if (num < 2 || num % 2 == 0) 
		        return num == 2; 
		    for (int i = 3; i * i <= num; i += 2) 
		        if (num % i == 0) 
		            return false; 
		    return true; 
	}

}
