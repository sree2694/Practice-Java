import java.util.Scanner;
import java.util.stream.IntStream;

public class NormalizedPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();

        boolean isPalindrome = isStrictPalindrome(input);

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }

    public static boolean isStrictPalindrome(String input) {
        // Normalize the string: remove non-alphanumeric characters, ignore case
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check using IntStream
        return IntStream.range(0, normalized.length() / 2)
                .allMatch(i -> normalized.charAt(i) == normalized.charAt(normalized.length() - 1 - i));
    }
}
