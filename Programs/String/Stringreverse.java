package String;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to reverse:");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        
        StringBuilder sb = new StringBuilder(str);
        
        System.out.println("Reversed string is:");
        System.out.println(sb.reverse().toString());
        System.out.println("string length is: "+sb.length());
        
        int count = 0;    
        
        //Counts each character except space    
        for(int i = 0; i < sb.length(); i++) {    
            if(sb.charAt(i) != ' ')    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count); 
	}

}
