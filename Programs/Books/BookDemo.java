package Books;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BookDemo {
	public static void main(String[] args) {
		LinkedList<Book> bookList = new LinkedList<>();
		Book b1 = new Book(123, "SQL", "Alan Beaulieu", "Kobo");
		Book b2 = new Book(169, "C Programming", "Balaguruswamy", "Vikram");
		Book b3 = new Book(8987, "Effective Java", "Jousha bloch", "sun");
		Book b4 = new Book(782, "SQL", "Jousha bloch", "sun");
		Book b5 = new Book(8987, "Effective Java", "Jousha bloch", "sun");
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);
		System.out.println(bookList);
		for (Book b : bookList) {
			if (b.getPublisher().equals("sun")) {
				System.out.println("ID: " + b.getId() + "\tName: " + b.getName());
			}
		}
		System.out.println("======Using Iterator======");
		Iterator<Book> itr = bookList.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			System.out.println("ID: "+b.getId()+"\tName: "+b.getName());
			itr.hashCode();
		}

	}
}