package Trainmoo;

import java.util.*;

public class Conversion {
	public static void main(String[] args) {
      
    HashSet<String> h_set = new HashSet<>();
         h_set.add("Apple");
         h_set.add("Mango");
         h_set.add("Lemon");
         h_set.add("Strawberry");
         h_set.add("Watermelon");
         h_set.add("Grapes");
     System.out.println("Original Hash Set: " + h_set);
   
    List<String> list = new ArrayList<String>(h_set);
    System.out.println("ArrayList contains: "+ list);
 }

}
