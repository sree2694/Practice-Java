import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MissingNumberStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        System.out.print("Enter " + (n - 1) + " numbers: ");
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        int total = IntStream.rangeClosed(1, n).sum();
        int sum = Arrays.stream(arr).sum();

        System.out.println("Missing number: " + (total - sum));
        scanner.close();
    }
}
// This program finds the missing number in a sequence from 1 to N using Java Streams.
// It reads N and the N-1 elements from the user, computes the total sum of numbers from 1 to N using `IntStream.rangeClosed`,
// and the sum of the elements in the array using `Arrays.stream`. The missing number is found by subtracting the actual sum from the total.
// The program prints the missing number to the console.