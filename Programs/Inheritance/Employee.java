package Inheritance;

public class Employee {
	private int id;
	private String name;
	private int CTC;
	public static int idgenerator=100;
	public Employee() {
		super();
		this.id = ++idgenerator;
		
	}
	public Employee(String name, int cTC) {
		super();
		this.id = +idgenerator;
		this.name = name;
		CTC = cTC;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCTC() {
		return CTC;
	}
	public void setCTC(int cTC) {
		CTC = cTC;
	}
	
	public double calcTax() {
		double tax = CTC*0.30/100;
		return CTC - tax;
		
	}
	@Override
	public String toString() {
		return "id=" + id + "\t\t name=" + name + "\nCTC=" + CTC + "\t calcTax()=" + calcTax();
	}
	
	
}
