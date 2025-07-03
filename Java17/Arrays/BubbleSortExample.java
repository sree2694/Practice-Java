import java.util.Arrays;

public class BubbleSortExample {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1};

        bubbleSort(arr);

        System.out.println("Bubble Sorted: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break; // Optimization
        }
    }
}
// This program implements the Bubble Sort algorithm to sort an array of integers.
// It iterates through the array multiple times, comparing adjacent elements and
// swapping them if they are in the wrong order. The process continues until no swaps
// are needed, indicating that the array is sorted. The `swapped` flag is used to
// optimize the algorithm by breaking out of the loop early if no swaps occur in a pass.