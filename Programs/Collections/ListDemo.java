package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> leapYearList = new ArrayList<>();
		leapYearList.add(2006);
		leapYearList.add(2010);
		leapYearList.add(1996);
		leapYearList.add(2000);
		
		System.out.println(leapYearList.toString());
		System.out.println("List size: " + leapYearList.size());
		
		System.out.println("Element at 3 Position: " + leapYearList.get(3));
		System.out.println(leapYearList.remove(2));

		leapYearList.add(2, 2019);

		System.out.println("Added: " + leapYearList.get(2));
		System.out.println(leapYearList.toString());
		
		
		List<Integer> YearList = new ArrayList<>();
		YearList.add(2015);
		YearList.add(1993);
		System.out.println("===========");
		leapYearList.addAll(YearList);
		System.out.println(leapYearList);

		System.out.println(leapYearList.remove(new Integer(2000)));
		System.out.println(leapYearList);
		
		for(Integer i: leapYearList)
			System.out.println(i);
		
	}

}
