package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> colorset=new HashSet<>();
		colorset.add("Red");
		colorset.add("Blue");
		colorset.add("Green");
		colorset.add("Black");
		colorset.add("Brown");
		
		System.out.println(colorset);
		for(String s: colorset)
			System.out.println(s);
	
	}

}
