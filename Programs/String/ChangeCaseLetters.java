package String;

public class ChangeCaseLetters {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("This Is a Sample text");
		System.out.println(changecase(str));

	}

	public static String changecase(StringBuffer str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLowerCase(c)) {
				s = s + Character.toUpperCase(c);
			} else {
				s = s + Character.toLowerCase(c);
			}
		}
		return s;
	}
}
