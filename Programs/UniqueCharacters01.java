import java.util.*;

public class UniqueCharacters01 {
	public static void main(String[] args) {
		String str = "ENGINEERING";
		Set<Character> uniqAlphs = getUniqueLetters(str);
		System.out.println(uniqAlphs);
	}

	public static Set<Character> getUniqueLetters(String str) {
		Set<Character> uniqset = new TreeSet<>();
		if (str == null)
			return uniqset;

		str = str.trim();
		char[] arr = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(arr[i]) || Character.isDigit(arr[i])) {
				uniqset.add(arr[i]);
			}
		}

		return uniqset;
		// ADD YOUR CODE HERE
	}
}
