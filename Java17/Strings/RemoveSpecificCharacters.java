import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveSpecificCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string A (original): ");
        String a = scanner.nextLine();

        System.out.print("Enter string B (characters to remove): ");
        String b = scanner.nextLine();

        String result = removeChars(a, b);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String removeChars(String a, String b) {
        Set<Character> toRemove = new HashSet<>();
        for (char c : b.toCharArray()) {
            toRemove.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : a.toCharArray()) {
            if (!toRemove.contains(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
// This code removes specific characters from a string based on another string.
// It reads two strings from the user: the original string and the string containing characters to remove.
// It uses a Set to store characters to be removed for efficient lookup.
// The program constructs a new string by appending characters from the original string that are not in the removal set.
// Finally, it prints the resulting string after removing the specified characters.