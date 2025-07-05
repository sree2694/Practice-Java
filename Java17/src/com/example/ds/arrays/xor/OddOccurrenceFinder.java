package com.example.ds.arrays.xor;

public class OddOccurrenceFinder {
// This class provides a method to find the element that occurs an odd number of times in an array.
    public static int findOddOccurrence(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR cancels even pairs, leaves the odd one
        }
        return result;
    }
}
