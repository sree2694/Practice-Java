package Collections;

import java.util.ArrayList;

public class StudentListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stList = new ArrayList<>();
		ArrayList<Student> stList2 = new ArrayList<>();
		
		Student s1 = new Student ("Bhanu",67,56,68);
		Student s2 = new Student ("Raju",80,70,76);
		
		stList.add(s1);
		stList.add(s2);
		
		stList.add(new Student("Sam",79,89,89));
		stList.add(new Student("seenu",90,79,95));
		System.out.println(stList);
		
		for(Student s : stList) {
			if(s.percentage()>=85)
			stList.add(s);
			//System.out.println("Id: "+s.getId()+"\tName: "+s.getName()+"\tPercentage: "+s.percentage());	
	
				if(s.percentage()>=60 && s.percentage()>=84)
					stList2.add(s);
			}
		}
		
	}
