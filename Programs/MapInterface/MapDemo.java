package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> countryMap = new HashMap<>();
		countryMap.put("India", "New Delhi");
		countryMap.put("France", "Paris");
		countryMap.put("USA", "Washington DC");
		countryMap.put("Mexico", "Mexico city");
		countryMap.put("Srilanka", "Colombo");
		countryMap.put("India", "Delhi");//@Override
		System.out.println(countryMap);
		System.out.println("Key : India Value:"+countryMap.get("India"));
		
		System.out.println(countryMap.containsKey(null));//Searching key
		System.out.println(countryMap.containsKey("UK"));
		System.out.println("\n=========Remove=============");
		System.out.println(countryMap.remove("France"));
		System.out.println(countryMap);
		System.out.println("======keyset & values===========");
		System.out.println(countryMap.keySet());
		System.out.println(countryMap.values());
		System.out.println("========Entry Set=======");
		System.out.println(countryMap.entrySet());
		System.out.println("==========Using For each===========");
		for(Map.Entry<String, String> m : countryMap.entrySet())
			System.out.println("Key: "+m.getKey()+"\t Values: "+m.getValue());
	}

}
