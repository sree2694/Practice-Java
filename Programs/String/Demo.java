package String;



public class Demo {

	public static void main(String[] args) {
		
		String str = "Hello World";
		String str1 = new String("HelloIndia");
		System.out.println("Index: "+str.indexOf("H"));
		System.out.println("Length: "+str.lastIndexOf("l"));
		System.out.println("Substring: "+str.substring(5));
		System.out.println("SubString: "+str.substring(1, 8));
		System.out.println("SubSequence: "+str.subSequence(1, 8));
		System.out.println("FirstName: "+str.subSequence(0, 9));
		System.out.println("LastName: "+str.substring(10, 16));

	}

}
