package Arrays;

import java.util.Scanner;

public class AveragevalueofInteger {

	public static void main(String[] args) {
		int size;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Integer");
		size = scan.nextInt();
		int[] arr = new int[size];
		
		for(int i= 0; i<size; i++) {
			
			arr[i] = scan.nextInt();	
		}
		System.out.println("Average"+AveragevalueofInteger(arr));
	}
		
private static double AveragevalueofInteger(int arr[]) {
	double sum =0;
	
	for(int i= 0; i<arr.length; i++) {
		System.out.println(arr[i]);
		sum = sum + arr[i];
	}

		return ((double)sum)/arr.length;
	}

}
