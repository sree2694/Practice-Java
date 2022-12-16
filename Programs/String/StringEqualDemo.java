package String;

public class StringEqualDemo {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = "hello";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		System.out.println(str1==str4);
		System.out.println(str1.equals(str4));
		System.out.println(str3.compareTo(str4));
	}

}
