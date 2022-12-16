package ExceptionHandling;

public class AgeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ageCheck(0);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured:"+e);
		}

	}

	public static void ageCheck(int age) throws InvalidAgeException {
		// TODO Auto-generated method stub
		if(age <= 0)
		{
			throw new InvalidAgeException("Please enter correct Age");
		}
		else 
			System.out.println("Your age is "+age);
		
	}

}
