import java.util.Arrays;

public class InsertionSortExample {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1};

        insertionSort(arr);

        System.out.println("Insertion Sorted: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
// This program implements the Insertion Sort algorithm to sort an array of integers.
// It builds a sorted array one element at a time by repeatedly taking the next element
// and inserting it into the correct position in the already sorted part of the array.
// The process continues until the entire array is sorted. The algorithm has a time
// complexity of O(n^2) in the worst case.