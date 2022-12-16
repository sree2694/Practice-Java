package ObjectAndClasses;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private String addr;
	
	public Student() {
		this.id = 0;
		this.name = null;
		this.addr = null;
	}
	public Student(int id, String name, String addr) {
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	public void read() {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter ID");
			this.id = scan.nextInt(); 
       System.out.println("Enter Name");
       		this.name = scan.next();
       System.out.println("Enter Address");
       		this.addr = scan.next();
 	  
	}
	public String display() {
	
		return "Entered id: "+id+"\nEntered name: "+name+"\nEntered adddress: "+addr;		
	}

}
