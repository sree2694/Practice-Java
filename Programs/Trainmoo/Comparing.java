package Trainmoo;

import java.util.*;

public class Comparing {
	public static void main(String[] args) {
		
		HashSet<String> h_set1 = new HashSet<String>();
		h_set1.add("Apple");
		h_set1.add("Mango");
		h_set1.add("Grapes");
		h_set1.add("Watermelon");
		System.out.println("Frist HashSet content: " + h_set1);
		
		HashSet<String> h_set2 = new HashSet<String>();
		h_set2.add("Grapes");
		h_set2.add("Pineapple");
		h_set2.add("Mango");
		h_set2.add("Orange");
		System.out.println("Second HashSet content: " + h_set2);
		h_set1.retainAll(h_set2);
		System.out.println("HashSet content:");
		System.out.println(h_set1);
	}
}
