import java.util.Scanner;

public class StrongNumberOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		Strongnumber(n);
	}

	public static void Strongnumber(int n) {
        int temp, rem, sum = 0;
        temp = n;
    
        while(n > 0)
        {
        	rem = n % 10;	
        	n  = n /10;
        	sum=sum + fact (rem);
        }
        
        if(temp == sum)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not a Strong Number");
        }
	}

	public static int fact(int n) {
		int fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact =fact * i;
        }
		return fact;
	}
}
