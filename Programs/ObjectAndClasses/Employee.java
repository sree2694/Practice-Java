package ObjectAndClasses;

public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	public static int idgenerator =100;
	
public Employee() {
		this.id = ++idgenerator;
		this.firstname = null;
		this.lastname = null;
		this.salary = 0;
	
	}
	public Employee(String firstname, String lastname, int salary, int idgenerator) {
		this.id = ++idgenerator;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		
	}

	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
	
	public String getName() {
		return firstname + lastname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public int getAnnualSalary() {
		int getAnnualSalary = (getSalary() * 12);
		System.out.println(getAnnualSalary);
		return getAnnualSalary;
	}
	public double raiseSalary() {
		double raiseSalary = getAnnualSalary() * (raiseSalary())/100;
		return  raiseSalary ;
	}
	
	public String display() {
		return "Employee[id = "+id+" name= "+getName()+" salary= "+raiseSalary()+"]";
	}
}
