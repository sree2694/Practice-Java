package Arrays;

public class MaxOfRow {

	public static void main(String[] args) {
		 int[][] arr = new int[][] { {1,2,5}, {2,3,9}, {7,6,4}};
            
            maxelement(3, arr); 

	}

	private static void maxelement(int no_of_rows, int[][] arr) {
		int i = 0; 
		int j = 0;
        // Initialize max to 0 at beginning 
        // of finding max element of each row 
        int max = 0; 
        int[] result = new int[no_of_rows]; 
        while (i < no_of_rows) { 
            for (j = 0; j < arr[i].length; j++) { 
                if (arr[i][j] > max) { 
                    max = arr[i][j]; 
                } 
            } 
            result[i] = max; 
            max =0; 
            i++; 
  
        } 
		
        printArray(result); 
  
    } 
	private static void printArray(int[] result) { 
		
        for (int i =0; i<result.length;i++) { 
            	System.out.println(" max = "+ result[i]); 
        } 
    }

}
