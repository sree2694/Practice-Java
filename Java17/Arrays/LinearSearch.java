import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array elements (space-separated): ");
        String[] tokens = scanner.nextLine().split("\\s+");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        System.out.print("Enter element to search: ");
        int target = scanner.nextInt();

        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found.");
        }

        scanner.close();
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
// This program implements a linear search algorithm to find an element in an array.
// It prompts the user to enter the elements of the array and the target element to search for.
// The `linearSearch` method iterates through the array, checking each element against the target.
// If the target is found, it returns the index; otherwise, it returns -1. The result is printed to the console.