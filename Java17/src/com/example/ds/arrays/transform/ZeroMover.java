package com.example.ds.arrays.transform;

import java.util.Arrays;

public class ZeroMover {
    public static void moveZerosToEnd(int[] arr) {
        int index = 0; // position to place non-zero element
     
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static String arrayToString(int[] arr) {
        return Arrays.toString(arr);
    }
}
