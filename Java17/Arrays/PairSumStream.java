import java.util.*;
import java.util.stream.*;

public class PairSumStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array (space-separated): ");
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        List<int[]> pairs = IntStream.range(0, arr.length)
            .boxed()
            .flatMap(i -> IntStream.range(i + 1, arr.length)
                .filter(j -> arr[i] + arr[j] == target)
                .mapToObj(j -> new int[]{arr[i], arr[j]}))
            .collect(Collectors.toList());

        if (pairs.isEmpty()) {
            System.out.println("No pairs found.");
        } else {
            pairs.forEach(pair -> System.out.println("(" + pair[0] + ", " + pair[1] + ")"));
        }

        scanner.close();
    }
}
// This program finds all unique pairs in an array that sum up to a given target using Java Streams.
// It prompts the user to enter the array elements and the target sum.
// The `IntStream.range` method is used to generate indices for pairs, and `flatMap` is used to find pairs that meet the condition.
// The results are collected into a list and printed. If no pairs are found, it informs the user accordingly.