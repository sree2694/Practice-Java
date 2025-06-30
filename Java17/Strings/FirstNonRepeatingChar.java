import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Character result = findFirstNonRepeating(input);

        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating characters found.");
        }

        scanner.close();
    }

    public static Character findFirstNonRepeating(String input) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // all characters are repeating
    }
}
// This code finds the first non-repeating character in a given string.
// It uses a LinkedHashMap to maintain the order of characters as they appear in the string.
// The program reads a string from the user, counts the occurrences of each character,
// and then finds and prints the first character that appears only once.
// If no such character exists, it informs the user that all characters are repeating.