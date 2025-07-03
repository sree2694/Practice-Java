import java.util.Arrays;
import java.util.Comparator;

public class StreamSortDescending {

    public static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 3, 1};

        Integer[] sorted = Arrays.stream(arr)
                                 .sorted(Comparator.reverseOrder())
                                 .toArray(Integer[]::new);

        System.out.println("Sorted (Descending): " + Arrays.toString(sorted));
    }
}
// This program uses Java Streams to sort an array of integers in descending order.
// It converts the array to a stream, applies the `sorted()` method with a reverse order
// comparator, and collects the results back into an array. The sorted array is then
// printed to the console. Note that the array is of type `Integer[]` to allow for
// sorting in reverse order using a comparator.