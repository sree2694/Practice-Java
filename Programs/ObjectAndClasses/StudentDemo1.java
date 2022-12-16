package ObjectAndClasses;

public class StudentDemo1
{
	 
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Student1 s1 = new Student1("sree","hyd");
		System.out.println(s1.display());
	
		Student1 s2 = new Student1("sai","Md");
		System.out.println(s2.display());
		
		Student1 s3 = new Student1("Bhanu","chennai");
		System.out.println(s3.display());
		
		s3.College = "BVRIT";
		System.out.println(s3.display());
		
		
		System.out.println("===============");
		System.out.println("No.of Object: "+Student1.noOfObjects); 
	
	}

}
