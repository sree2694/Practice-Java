package Arrays;

public class MaxofEachRow {

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		MaxOfEachRow(matrix);

	}

	private static void MaxOfEachRow(int[][] matrix) {
		int i = 0;
		int j = 0;
		int max = matrix[i][j];
		for (i = 0; i < matrix.length; i++) {
		for (j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];}
					else {
					int[] result = null;
					result[i] =max;
					max = 0;
					i++;
					
				}
				//matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
				//System.out.print(matrix[i][j]+ " ");
				System.out.println(" max = " + max);
			}
		}
	}

}


