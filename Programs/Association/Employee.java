package Association;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private int salary;
	private Address addr;
	public static int idgenerator = 100;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String designation, int salary, Address addr) {
		super();
		this.id = ++idgenerator;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", addr=" + addr + "]";
	}

}
