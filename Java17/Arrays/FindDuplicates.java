import java.util.*;

public class FindDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array elements (space-separated): ");
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }

        scanner.close();
    }
}
// This code reads a space-separated list of integers from the user,
// checks for duplicates using a `HashSet`, and prints the duplicate elements.
// It uses one set to track seen elements and another set to collect duplicates.
// If no duplicates are found, it informs the user accordingly.