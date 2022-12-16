package MapInterface;

public class OddNumberOfTimes {

	public static void main(String[] args) {
		int arr[] = {1,1,2,1,3,2,3,4,4,3,4,4,6};
		int i; 
        for (i = 0; i < arr.length; i++) { 
            int count = 0; 
            for (int j = 0; j < arr.length; j++) { 
                if (arr[i] == arr[j]) 
                    count++; 
            } 
            if (count % 2 != 0) 
                System.out.println(arr[i]);  
        } 
    
    } 
	}

