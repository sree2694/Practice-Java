import java.util.Arrays;

public class StreamSortAscending {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1};

        // Sort using streams (ascending)
        int[] sorted = Arrays.stream(arr)
                             .sorted()
                             .toArray();

        System.out.println("Sorted (Ascending): " + Arrays.toString(sorted));
    }
}
// This program uses Java Streams to sort an array of integers in ascending order.
// It converts the array to a stream, applies the `sorted()` method, and collects the
// results back into an array. The sorted array is then printed to the console.