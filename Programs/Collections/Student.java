package Collections;

public class Student {
	private int id;
	private String name;
	private int sub1;
	private int sub2;
	private int sub3;
	public static int idgenerator =100;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student( String name, int sub1, int sub2, int sub3) {
		super();
		this.id = ++idgenerator;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public int getId() {
		return id;
	}

	public double percentage() {
		return ((sub1 + sub2 + sub3)/3); 
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3
				+ ", percentage()=" + percentage() + "]\n";
	}

	
	
}
