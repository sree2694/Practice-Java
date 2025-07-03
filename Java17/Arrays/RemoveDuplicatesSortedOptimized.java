import java.util.*;
import java.util.stream.*;

public class RemoveDuplicatesSortedOptimized {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sorted array elements: ");
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .sorted()
                            .toArray();

        List<Integer> result = IntStream.range(0, input.length)
                .filter(i -> i == 0 || input[i] != input[i - 1])
                .map(i -> input[i])
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Unique elements: " + result);
        scanner.close();
    }
}
// This program reads a sorted array of integers from the user, removes duplicates
// using Java Streams, and prints the unique elements. It uses `IntStream.range` to
// iterate over the indices of the array, filtering out duplicates by comparing each