package MapInterface;

//import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, Long> phonebook = new TreeMap<>();
		phonebook.put("Chinna", 9403899423l);
		phonebook.put("Raju", 9403689942l);
		phonebook.put("Kumar", 9403689942l);
		phonebook.put("Sunny", 9933445599l);
		System.out.println(phonebook);
		System.out.println("====for each===");
		for(Map.Entry<String, Long> m : phonebook.entrySet())
			System.out.println("Key: "+m.getKey()+"\t Values: "+m.getValue());
	}

	}
