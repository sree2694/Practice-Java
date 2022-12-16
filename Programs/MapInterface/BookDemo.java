package MapInterface;

import java.util.HashMap;
import java.util.Map;


public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Book> bookmap = new HashMap<>();
		Book b1 = new Book("SQL", "Alan Beaulieu");
		Book b2 = new Book("C Programming", "Balaguruswamy");
		Book b3 = new Book("Effective Java", "Jousha bloch");
		Book b4 = new Book("SQL", "Jousha bloch");
		
		bookmap.put(b1.getId(),b1);
		bookmap.put(b2.getId(),b2);
		bookmap.put(b3.getId(),b3);
		bookmap.put(b4.getId(),b4);
		
		System.out.println(bookmap);
		
		System.out.println("=====for each =====");
		for(Map.Entry<Integer, Book> m : bookmap.entrySet())
			System.out.println("Key: "+m.getKey()+"\t Values: "+m.getValue());
	
	}

}
