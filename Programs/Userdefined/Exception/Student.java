package Userdefined.Exception;

public class Student {
	private int id;
	private String name;
	private String addr;
	public static int idgenerator = 100;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String addr) {
		super();
		this.id = ++idgenerator;
		this.name = name;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addr=" + addr + "]\n";
	}

}
