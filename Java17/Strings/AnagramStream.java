import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        boolean result = isAnagram(str1, str2);
        System.out.println(result
                ? "They are anagrams."
                : "They are NOT anagrams.");

        scanner.close();
    }

    public static boolean isAnagram(String s1, String s2) {
        Map<Character, Long> freq1 = getCharFrequencyMap(s1);
        Map<Character, Long> freq2 = getCharFrequencyMap(s2);
        return freq1.equals(freq2);
    }

    private static Map<Character, Long> getCharFrequencyMap(String str) {
        return str.toLowerCase()
                  .replaceAll("\\s", "")
                  .chars()
                  .mapToObj(c -> (char) c)
                  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
// This code uses Java Streams to check if two strings are anagrams.
// It reads two strings from the user, processes them to count character frequencies,
// and compares the frequency maps to determine if they are anagrams.
// The result is printed to the console.