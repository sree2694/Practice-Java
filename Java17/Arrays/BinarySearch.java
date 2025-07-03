import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sorted array elements (space-separated): ");
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                          .mapToInt(Integer::parseInt)
                          .sorted() // Ensure sorted
                          .toArray();

        System.out.print("Enter element to search: ");
        int target = scanner.nextInt();

        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found.");
        }

        scanner.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
}
// This program implements a binary search algorithm to find an element in a sorted array.
// It prompts the user to enter the elements of the array and the target element to search for.
// The `binarySearch` method uses a while loop to narrow down the search range based on comparisons.
// If the target is found, it returns the index; otherwise, it returns -1. The result is printed to the console.