import java.util.*;
import java.util.stream.*;

public class ReverseArrayStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array elements (space-separated): ");
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        List<Integer> reversed = IntStream.range(0, arr.length)
                .mapToObj(i -> arr[arr.length - 1 - i])
                .collect(Collectors.toList());

        System.out.println("Reversed array (Stream): " + reversed);
        scanner.close();
    }
}
// This code reads a space-separated list of integers from the user,
// reverses the array using Java Streams, and prints the reversed list.
// It uses `IntStream` to iterate over the indices of the original array in reverse order,
// collecting the elements into a list. This approach is functional and leverages the power of streams.