package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeDemo {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		LinkedList<Employee> Employeelist = new LinkedList<>();
		LinkedList<Employee> FresherEmployeelist = new LinkedList<>();

		Employeelist.add(new Employee(1, "Bhanu", 50000));
		Employeelist.add(new Employee(2, "Chinna", 15000));
		Employeelist.add(new Employee(3, "Varma", 18000));
		Employeelist.add(new Employee(4, "Jhon", 35000));
		Employeelist.add(new Employee(5, "Michel", 45000));
		Employeelist.add(new Employee(6, "Sharma", 5000));
		Employeelist.add(new Employee(7, "Sikindhar", 7000));

		Iterator<Employee> itr = Employeelist.iterator();

		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (emp.getSalary() <= 20000) {
				FresherEmployeelist.add(emp);
				itr.remove();
			}
		}
		for (Employee E : Employeelist)
			System.out.println(E);
		System.out.println("======");
		for (Employee E : FresherEmployeelist)
			System.out.println(E);
	}
}