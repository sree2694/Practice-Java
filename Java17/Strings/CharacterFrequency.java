import java.util.*;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) continue; // Skip spaces
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character Frequencies:");
        freqMap.forEach((k, v) -> System.out.println(k + " → " + v));

        scanner.close();
    }
}
// This program reads a string from the user and calculates the frequency of each character in the string,
// ignoring spaces. It uses a HashMap to store the character frequencies and prints them out in a readable format.