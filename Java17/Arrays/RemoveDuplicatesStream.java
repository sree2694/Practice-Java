import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array elements (space-separated): ");
        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                                    .map(Integer::parseInt)
                                    .collect(Collectors.toList());

        List<Integer> result = input.stream()
                                    .distinct()
                                    .collect(Collectors.toList());

        System.out.println("Array after removing duplicates: " + result);
        scanner.close();
    }
}
// This program reads an array of integers from the user, removes duplicates using
// Java Streams, and prints the unique elements. It uses the `distinct()` method
// to filter out duplicates and collects the results into a new list. The original
// order of elements is preserved in the output list.