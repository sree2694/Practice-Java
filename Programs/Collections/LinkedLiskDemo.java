package Collections;

import java.util.LinkedList;
import java.util.List;
public class LinkedLiskDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> countryList=new LinkedList<>(); 
		countryList.add("India");
		countryList.add("USA");
		countryList.add("UK");
		countryList.add("China");
		countryList.add("Japan");
		
		System.out.println(countryList);
		for(String s: countryList)
			System.out.println(s);
	
		countryList.addFirst("Germany");
		System.out.println(countryList);
		
	}

}
