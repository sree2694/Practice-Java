import java.util.Scanner;

/** Please don't make the class public **/
class Solution {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num = 0, d, evencount = 0, oddcount = 0;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		while (num > 0) {
			d = num % 10;
			if (d % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
			num = num / 10;
		}
		System.out.println("Even number of digits  : " + evencount);
		System.out.println("Odd number of digits  : " + oddcount);

	}

}