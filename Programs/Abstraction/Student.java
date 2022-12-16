package Abstraction;

public abstract class Student {
	private int id;
	private String name;
	public static int idgenerator =100;
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
		this.id = ++idgenerator;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract double findpercentage();
	
	
	

}
