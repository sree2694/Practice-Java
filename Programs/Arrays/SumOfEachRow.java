package Arrays;

public class SumOfEachRow {

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		SumOfEachRow(matrix);

	}

	public static void SumOfEachRow(int[][] matrix) {
		int Row = 0;
		for (int i = 0; i < matrix.length; i++) {
			Row = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				Row = Row + matrix[i][j];
			}
	
			System.out.println("Sum of row " + (i + 1) + " row = " + Row);
		}
	}

}
