package comparableinterface;

import java.util.ArrayList;
import java.util.Collections;

public class Friend {
	
	
public static void main(String[] args) {
	ArrayList<String> f=new ArrayList<>();  
	f.add(new String("Vijay")); 
	f.add(new String("Bhanu"));
	f.add(new String("Chinna"));
	f.add(new String("Naveen"));
	System.out.println("========Before Swapping========");
	System.out.println(f);
	System.out.println("========After Swapping========");
	Collections.sort(f);  
	System.out.println(f);
	System.out.println("========reverse========");
	Collections.reverse(f);
	System.out.println(f);

	
}
}
