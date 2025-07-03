import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesSortedStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sorted array elements (space-separated): ");
        int[] sortedArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                                  .mapToInt(Integer::parseInt)
                                  .toArray();

        // Stream-based deduplication
        int[] uniqueArray = Arrays.stream(sortedArray)
                                  .distinct()
                                  .toArray();

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
        scanner.close();
    }
}
// This program reads a sorted array of integers from the user, removes duplicates
// using Java Streams, and prints the unique elements. The `distinct()` method
// is used to filter out duplicates, and the results are collected into a new array.
// The original order of elements is preserved in the output array since the input
// is already sorted.