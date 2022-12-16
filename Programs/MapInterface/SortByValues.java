package MapInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class SortByValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Double> bookmap = new HashMap<>();
		bookmap.put("C++", 150.0);
		bookmap.put("Java", 736.0);
		bookmap.put("DBMS", 480.0);
		bookmap.put("SQL", 457.0);
		System.out.println("-------Before Sorting---------");
		for(String s : bookmap.keySet())
			System.out.println(s+"\t"+bookmap.get(s));

		
		Set<Entry<String,Double>> set = bookmap.entrySet();
		List<Entry<String,Double>> list = new ArrayList<>(set);
		Collections.sort(list,new Comparator<Entry<String,Double>>()
		{
			@Override
			public int compare(Entry<String, Double> o1, Entry<String, Double> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println("-------After Sorting----");
	for(Entry<String, Double> entry: list)
		System.out.println(entry);
		
}
}