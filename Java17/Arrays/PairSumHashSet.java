import java.util.*;

public class PairSumHashSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array elements (space-separated): ");
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        System.out.print("Enter target sum: ");
        int target = scanner.nextInt();

        findPairsWithSum(arr, target);
        scanner.close();
    }

    public static void findPairsWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<String> printedPairs = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                // avoid duplicates (e.g., (2, 7) and (7, 2))
                int a = Math.min(num, complement);
                int b = Math.max(num, complement);
                String pair = a + "," + b;
                if (!printedPairs.contains(pair)) {
                    System.out.println("(" + a + ", " + b + ")");
                    printedPairs.add(pair);
                }
            }
            seen.add(num);
        }

        if (printedPairs.isEmpty()) {
            System.out.println("No pairs found.");
        }
    }
}
// This program finds all unique pairs in an array that sum up to a given target.
// It uses a HashSet to track seen numbers and another HashSet to avoid printing duplicate pairs.
// The user is prompted to enter the array elements and the target sum.
// The `findPairsWithSum` method checks for each number if its complement (target - number) has been seen.
// If so, it prints the pair in a consistent order to avoid duplicates.