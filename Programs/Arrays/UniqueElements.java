package Arrays;
import java.io.*;
import java.util.*;

class UniqueElements {

    public static void main(String[] args) {

    	int[] arr1 = { 4, 6, 3, 1, 5, 3, 6, 9 };

		int[] out = returnArray(arr1);

		for (int i = 0; i < out.length - 1; i++) {
			System.out.print(out[i] + ",");
		}
		System.out.print(out[out.length - 1]);

    }
    public static int[] returnArray(int[] arr1) {

		int[] res = new int[arr1.length];
		int m = 0;

		for (int i = 0; i < arr1.length; i++) {

			int count = 0;

			for (int j = 0; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					count++;
				}
			}

			if (count == 1) {
				res[m] = arr1[i];
				m++;
			}
		}
		int[] out = new int[m];
		for (int k = 0; k < out.length; k++) {
			out[k] = res[k];
		}
		return out;
	}

}

