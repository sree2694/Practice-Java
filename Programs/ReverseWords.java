public class ReverseWords {

	public static void main(String[] args) {
		System.out.println(ReverseWords.reverse("talent sprint"));
	}

	public static String reverse(String str) {
		if (str == null)
			return null;
		if (str == "")
			return null;
		String[] arr = str.split(" ");
		String Reverse = "", Word = "";
		for (int i = 0; i < arr.length; i++) {
			Word = arr[i];
			for (int j = Word.length() - 1; j >= 0; j--) {
				Reverse += arr[i].charAt(j);
			}
			Reverse += " ";

		}
		return Reverse.substring(0, Reverse.length() - 1);
	}
}