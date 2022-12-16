package String;

public class Maskmail {
    public static void main(String[] args) {
        String email = "testmail@.@mailme.com";
        
        System.out.println(maskMailID(email));
    }

    public static String maskMailID(String email) {
    	int index = email.indexOf("@");
    	String email_id = email.substring(index);
    	String mask="";
    	int count1= 0, count2 = 0;
    	
    	int size =email.substring(2, index).length();
    	for(int i=0;i<size;i++) {
    		mask +='X';
    		
    	}
    	
    	
		mask = email.substring(0, 2)+mask+email_id;
		return mask;
    }

}

