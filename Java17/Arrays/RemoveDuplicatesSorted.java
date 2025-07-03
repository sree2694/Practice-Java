import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesSorted {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sorted array elements (space-separated): ");
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        int length = removeDuplicates(arr);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1; // new length
    }
}
// This program reads a sorted array of integers from the user, removes duplicates,
// and prints the unique elements. It modifies the original array in place and
// returns the new length of the array after removing duplicates. The method
// `removeDuplicates` uses a two-pointer technique to efficiently remove duplicates
// while maintaining the order of elements.