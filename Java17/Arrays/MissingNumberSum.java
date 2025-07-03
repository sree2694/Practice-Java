import java.util.Scanner;
import java.util.Arrays;

public class MissingNumberSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N (expected max number): ");
        int n = scanner.nextInt();

        System.out.print("Enter " + (n - 1) + " elements (space-separated): ");
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(arr).sum();

        int missing = expectedSum - actualSum;

        System.out.println("Missing number: " + missing);
        scanner.close();
    }
}
// This program calculates the missing number in a sequence from 1 to N.   