import java.util.Scanner;

public class MinMaxSecond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        findMinMax(arr);
        scanner.close();
    }

    public static void findMinMax(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }

        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            // For min and second min
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num > min && num < secondMin) {
                secondMin = num;
            }

            // For max and second max
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num < max && num > secondMax) {
                secondMax = num;
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Second Min: " + (secondMin == Integer.MAX_VALUE ? "Not found" : secondMin));
        System.out.println("Max: " + max);
        System.out.println("Second Max: " + (secondMax == Integer.MIN_VALUE ? "Not found" : secondMax));
    }
}
