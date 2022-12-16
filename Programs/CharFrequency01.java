import java.util.HashMap;
import java.util.Map;

public class CharFrequency01 {
	public static void main(String[] args) {
		Map<Character, Integer> freqCount = frequencyCount("ELEMENT");
		System.out.println(freqCount);

		for (Character key : freqCount.keySet()) {
			System.out.println(key + " " + freqCount.get(key));
		}

	}

	public static Map<Character, Integer> frequencyCount(String str) {

		Map<Character, Integer> freqCount = new HashMap<>();
		if (str == null)
			return freqCount;
		int count = 0;
		str = str.trim();
		str = str.toUpperCase();
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {

			if (Character.isAlphabetic(arr[i])) {
				if (freqCount.containsKey(arr[i])) {
					count = freqCount.get(arr[i]);
					freqCount.put(arr[i], ++count);

				} else
					freqCount.put(arr[i], 1);
			}
		}
		return freqCount;
	}
}
