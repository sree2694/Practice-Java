package Arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int[] arr = {1,5,10,15,20};
		System.out.println("Enter number");
		int element = scan.nextInt();
		
		System.out.println("Linear Element :"+search(arr, element));
	}

	public static double search(int arr[], int element) {
		for(int i= 0; i<arr.length; i++) {
			if(arr[i]==element) {
				return 1;
		}
			else
		return 0;
	}
		return element;
	
	}

}
