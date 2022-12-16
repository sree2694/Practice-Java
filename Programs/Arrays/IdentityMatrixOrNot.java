package Arrays;

import java.util.Scanner;

public class IdentityMatrixOrNot {

	public static void main(String[] args) {
		int matrix[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		IdentityMatrix(matrix);
	}

	private static void IdentityMatrix(int[][] matrix) {
		boolean result = true;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == j && matrix[i][j] != 1) {
					result = false;
					break;
				}
				if (i != j && matrix[i][j] != 0) {
					result = false;
					break;
				}
			}
		}
		if (result)
			System.out.println("Matrix is an identity matrix");
		else
			System.out.println("Matrix is not an identity matrix");
	}
}