import java.util.Scanner;

public class MissingNumberXOR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        System.out.print("Enter " + (n - 1) + " elements: ");
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        int xor1 = 0, xor2 = 0;

        // XOR 1 to N
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        // XOR elements in array
        for (int num : arr) {
            xor2 ^= num;
        }

        int missing = xor1 ^ xor2;
        System.out.println("Missing number: " + missing);
        scanner.close();
    }
}
// This program finds the missing number in a sequence from 1 to N using XOR.
// It reads N and the N-1 elements from the user, computes the XOR of all numbers from 1 to N,
// and the XOR of the elements in the array. The missing number is found by XORing these two results.
// The program prints the missing number to the console.