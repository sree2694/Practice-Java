import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayRight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array elements (space-separated): ");
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        System.out.print("Enter K (positions to rotate): ");
        int k = scanner.nextInt();
        k %= arr.length;  // handle k > n

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        System.out.println("Rotated array (right): " + Arrays.toString(arr));
        scanner.close();
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
// This program rotates an array to the right by K positions using the reverse method.
// It first reverses the entire array, then reverses the first K elements, and finally reverses the remaining elements.
// The result is printed to the console. The program handles cases where K is greater than the array length by using modulo operation.