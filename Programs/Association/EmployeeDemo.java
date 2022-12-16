package Association;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address d = new Address("LIG-12", "kphb", "Brandfactory", "Hyd", "TS", 500085);
		Employee e1 = new Employee("Bhanu", "HR", 10000, d);
		System.out.println(e1);
		e1.getAddr().getState();
		Address temp = e1.getAddr();
		System.out.println(temp.getCity());
		

	}

}
