import java.util.*;
import java.util.stream.Collectors;

public class MinMaxSecondStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array elements (space-separated): ");
        String[] tokens = scanner.nextLine().split("\\s+");

        List<Integer> list = Arrays.stream(tokens)
                                   .map(Integer::parseInt)
                                   .distinct()
                                   .sorted()
                                   .collect(Collectors.toList());

        if (list.size() < 2) {
            System.out.println("Need at least two unique elements.");
        } else {
            System.out.println("Min: " + list.get(0));
            System.out.println("Second Min: " + list.get(1));
            System.out.println("Max: " + list.get(list.size() - 1));
            System.out.println("Second Max: " + list.get(list.size() - 2));
        }

        scanner.close();
    }
}
// This code reads a space-separated list of integers from the user,
// converts them to a list of unique integers, sorts them, and then retrieves
// the minimum, second minimum, maximum, and second maximum values from the sorted list.
// It handles cases where there are not enough unique elements gracefully.