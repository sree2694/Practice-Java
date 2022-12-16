package MapInterface;

import java.util.HashMap;

public class OddOccurenceUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hmap = new HashMap<>(); 
		int arr[] = {1,1,2,1,3,2,3,4,4,3,4,4,6};
		int count =0;
		for (int i = 0; i < arr.length; i++) { 
            if (hmap.containsKey(arr[i])) { 
                count = hmap.get(arr[i]); 
                hmap.put(arr[i], ++count); 
            } 
            else
                hmap.put(arr[i], 1); 
        } 
        for (Integer i : hmap.keySet()) { 
            if (hmap.get(i) % 2 != 0) 
                System.out.println(i); 
        } 
	}

}
