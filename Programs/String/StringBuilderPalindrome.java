package String;
import java.util.Scanner;

public class StringBuilderPalindrome {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	      System.out.print("Enter string : ");
	           
	      String str = scan.nextLine();
	      StringBuilder strBuilder = new StringBuilder(str);
	      strBuilder.reverse();
	           StringPalindrome(strBuilder);
	}

	public static void StringPalindrome(StringBuilder strBuilder) {
		String str="";
		
	      if(str.equals(strBuilder.toString())){
	          System.out.println("String is palindrome");
	      } else {
	          System.out.println("String is not palindrome ");
	      }
		
	}

}
