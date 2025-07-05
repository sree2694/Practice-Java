package com.example.ds.arrays;

import com.example.ds.arrays.kadane.KadaneAlgorithm;
import com.example.ds.arrays.xor.OddOccurrenceFinder;
import com.example.ds.arrays.transform.ZeroMover;

public class MainApp {
    public static void main(String[] args) {
        // Kadane's Algorithm
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = KadaneAlgorithm.maxSubArraySum(nums1);
        System.out.println("Kadane's Max Subarray Sum: " + maxSum);

        // Find Odd Occurrence
        int[] nums2 = {2, 3, 5, 4, 5, 3, 4};
        int odd = OddOccurrenceFinder.findOddOccurrence(nums2);
        System.out.println("Element appearing odd times: " + odd);

        // Move Zeros to End
        int[] nums3 = {0, 1, 0, 3, 12};
        ZeroMover.moveZerosToEnd(nums3);
        System.out.println("After moving zeros: " + ZeroMover.arrayToString(nums3));
    }
}
// This is the main application class that demonstrates the use of various algorithms on arrays.
// It includes Kadane's algorithm for maximum subarray sum, finding an element that appears an odd number of times,
// and moving all zeros in an array to the end while maintaining the order of non-zero elements.