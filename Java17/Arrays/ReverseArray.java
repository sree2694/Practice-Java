import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
        scanner.close();
    }

    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
// This code reads an array of integers from the user, reverses the array in place,
// and then prints the reversed array. The `reverseArray` method uses a two-pointer technique
// to swap elements from the start and end of the array until it reaches the middle.