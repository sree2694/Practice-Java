package ObjectAndClasses;

public class Student2demo {

	public static void main(String[] args) {
		Student2 s1 = new Student2("Bhanu",72,63,73);
		System.out.println(s1.toString());
		
		Student2 s2 = new Student2("Krishna",70,65,60);
		System.out.println(s2.toString());

		Student2 s3 = new Student2("John",74,62,49);
		System.out.println(s3.toString());
		
		System.out.println("\nStudent1 percentage: "+s1.percentage());
		System.out.println("Student2 percentage: "+s2.percentage());
		System.out.println("Student3 percentage: "+s3.percentage());

		Student2 temp = Student2.Compare(s1, s2);
		Student2 topper = Student2.Compare(temp,s3);
		System.out.println(topper);
		System.out.println("\n"+Student2.Compare(Student2.Compare(s1, s2),s3));
		
	
	}

}
