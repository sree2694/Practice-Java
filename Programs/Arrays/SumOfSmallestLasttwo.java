package Arrays;

import java.util.Scanner;

public class SumOfSmallestLasttwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min1,min2,n = 0,i;
		int []arr=new int[100];
		System.out.println("Enter size of elements");
		n= scan.nextInt();
		System.out.println("Enter  elements");
		
		for(i=0;i<n;i++) {
			arr[i] = scan.nextInt();
			
		}
		
		if(arr[0]<arr[i]) {
			min1 = arr[0];
			min2 = arr[0];
			
		}
		else
		{
			min1=arr[1];
			min2=arr[0];
			
		}	
		for(i=2;i<n;i++) {
			if(arr[i] < min1) {
				min1 = arr[i];
				min2 = min1;
				 
				
			}
			
			else if(arr[i]<min2) {
				min2=arr[i];
				
			}
			
		}

			int sum = min1 + min2;
			System.out.println(min1+ "+" +min2+ " = "+sum);
	}

}
