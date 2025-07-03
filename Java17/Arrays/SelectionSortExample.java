import java.util.Arrays;

public class SelectionSortExample {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1};

        selectionSort(arr);

        System.out.println("Selection Sorted: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
// This program implements the Selection Sort algorithm to sort an array of integers.
// It repeatedly finds the minimum element from the unsorted part of the array and
// swaps it with the first unsorted element. The process continues until the entire
// array is sorted. The algorithm has a time complexity of O(n^2) in the worst case.