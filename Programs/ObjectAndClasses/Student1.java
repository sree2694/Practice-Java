package ObjectAndClasses;

import java.util.Scanner;

public class Student1 {
	private int id;
	private String name;
	private String addr;
	public static String College = "JBIET";
	public static int idgenerator =100;
	static int noOfObjects = 0; 
	  
  
	public Student1() {
		this.id = ++idgenerator;
		this.name = null;
		this.addr = null;
		noOfObjects += 1;
	}
	public Student1(String name, String addr) {
		this.id = ++idgenerator;
		this.name = name;
		this.addr = addr;
		noOfObjects += 1;
	}
	
	public String display() {
		System.out.println("===============");
		return "Entered id: "+id+"\nEntered name: "+name+"\nEntered adddress: "+addr+"\nCollege: "+College;		
	}

}
