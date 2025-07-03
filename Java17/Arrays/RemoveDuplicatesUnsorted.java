import java.util.*;

public class RemoveDuplicatesUnsorted {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array elements (space-separated): ");
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        Set<Integer> unique = new LinkedHashSet<>();
        for (int num : arr) {
            unique.add(num);
        }

        System.out.println("Array after removing duplicates: " + unique);
        scanner.close();
    }
}
// This program reads an array of integers from the user, removes duplicates,
// and prints the unique elements while maintaining their original order.
// It uses a LinkedHashSet to preserve the insertion order of elements.