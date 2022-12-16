package Userdefined.Exception;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import ExceptionHandling.Product;
import ExceptionHandling.WeightException;

public class StudentListDemo {

	public static void main(String[] args) {
		List<Student> studentlist = new LinkedList<Student>();
		studentlist.add(new Student("Bhanu", "HYD"));
		studentlist.add(new Student("Shyam", "vizag"));
		studentlist.add(new Student("arvind", "vjwd"));
		studentlist.add(new Student("naveen", "Khammam"));
		studentlist.add(new Student("srinu", "Guntur"));
		studentlist.add(new Student("sai", "Nellore"));
		studentlist.add(new Student("Anil", "krishna"));
		studentlist.add(new Student("Raju", "bhadrachalam"));
		studentlist.add(new Student("Durga", "nandigaama"));
		studentlist.add(new Student("Chandu", "machilipatnam"));
		System.out.println(studentlist);

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ID to Search");
		int id = scan.nextInt();
		Iterator<Student> itr = studentlist.iterator();
		boolean flag = false;
		Student sfound = null;

		while (itr.hasNext()) {

			Student s = itr.next();
			if (s.getId() == id) {
				flag = true;
				sfound = s;
			}
		}
		if (flag == true) {
			System.out.println(sfound);
		} else {
			try {
				throw new StudentNotFoundException("Invalid ID");
			} catch (StudentNotFoundException e) {
				System.out.println(e);
			}
		}
	}

}
