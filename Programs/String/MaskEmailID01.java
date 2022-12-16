package String; 
public class MaskEmailID01 {
    public static void main(String[] args) {
        String email = "testmail@.mailme.com";
        System.out.println(maskMailID(email));
    }

    public static String maskMailID(String email) {
    	 email= email.replaceAll("(?<=.{2}).(?=.*@)", "X");
	 	 return email;
    	
        
    }	

}
