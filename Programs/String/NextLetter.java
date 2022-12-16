package String;

public class NextLetter {
	public static void main(String[] args) {
		String str="A";
		String strIncremented=new String();
		for(int i=0;i<str.length();i++){
			strIncremented+=(char)(str.charAt(i)+1);
		}
		System.out.println(strIncremented);
	}

}
