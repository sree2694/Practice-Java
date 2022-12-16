package Loops;

import java.util.Scanner;

public class CombinationOfFruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     int n = 0;   
		 combination(n);

	}
	
	
	
private static void combination(int n) {
		// TODO Auto-generated method stub
	for (int b = 1; b <= 100; b++) {
		for (int o = 1; o <= 100; o++) {
			for (int a = 1; a <= 100; a++) {
				if ((b + o + a) == 100 && (b * 0.5 + o * 1 + a * 5) == 100) {
					System.out.println("Banana " + b + " Oranges " + o + " Apples " + a);

				}
			}
		}

	}		
	}
}


