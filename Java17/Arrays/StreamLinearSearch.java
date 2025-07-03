import java.util.Arrays;
import java.util.Scanner;

public class StreamLinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array (space-separated): ");
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();

        int index = Arrays.stream(arr)
                          .boxed()
                          .toList()
                          .indexOf(target);

        System.out.println(index != -1 ? "Found at index " + index : "Not found.");
        scanner.close();
    }
}
// This program performs a linear search using Java Streams.
// It reads an array of integers from the user, then searches for a target integer.
// The search is done using the `indexOf` method on a list created from the stream of the array.
// If the target is found, it prints the index; otherwise, it indicates that the target was not found.