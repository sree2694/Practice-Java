import java.util.Arrays;

public class StreamSortStrings {

    public static void main(String[] args) {
        String[] words = {"banana", "apple", "mango", "grape"};

        String[] sorted = Arrays.stream(words)
                                .sorted()
                                .toArray(String[]::new);

        System.out.println("Sorted Words: " + Arrays.toString(sorted));
    }
}
// This program uses Java Streams to sort an array of strings in ascending order.
// It converts the array to a stream, applies the `sorted()` method, and collects the
// results back into an array. The sorted array is then printed to the console.