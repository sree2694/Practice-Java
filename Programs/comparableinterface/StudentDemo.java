package comparableinterface;

import java.util.ArrayList;

import java.util.Collections;

public class StudentDemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stlist=new ArrayList<>();
		
		stlist.add(new Student ("Bhanu",97,96,68));
		stlist.add(new Student ("Raju",80,70,76));
		stlist.add(new Student("Arvind",99,89,89));
		stlist.add(new Student("seenu",90,79,95));
		System.out.println("======Before Sorting=====");
		System.out.println(stlist);
			
		System.out.println("======After Sorting=====");
		Collections.sort(stlist);
		System.out.println(stlist);
		
		



	}

}
