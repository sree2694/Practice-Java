package Arrays;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int size;
		Scanner scan =new Scanner(System.in);
		System.out.println("Size of the array");
		size = scan.nextInt();
		int arr[] = new int [size];
		for(int i=0; i<size; i++) {
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
