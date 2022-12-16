package Arrays;

public class DiagonalMatrix {

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9} };

		DiagonalMatrix(matrix);

	}

	private static void DiagonalMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(i==j&&j==i) {
					System.out.print(matrix[i][j] + " ");
				}
		//		else if(i+j==2){
		//			System.out.print(matrix[i][j] + " ");
		//		}

				else 
					System.out.print("0"+" ");
			}
			System.out.println();
		}

		
	}

}
