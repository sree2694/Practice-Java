package Loops;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		perfectnumber(n);

	}

	public static void perfectnumber(int n) {
		int i, Sum = 0 ;

		for(i = 1 ; i < n ; i++) {
			if(n % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == n) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}
	}    
		}
		


