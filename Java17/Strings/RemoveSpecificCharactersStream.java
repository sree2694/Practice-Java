import java.util.Set;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveSpecificCharactersStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string A (original): ");
        String a = scanner.nextLine();

        System.out.print("Enter string B (characters to remove): ");
        String b = scanner.nextLine();

        Set<Character> removeSet = b.chars()
                                    .mapToObj(c -> (char) c)
                                    .collect(Collectors.toSet());

        String result = a.chars()
                         .mapToObj(c -> (char) c)
                         .filter(c -> !removeSet.contains(c))
                         .map(String::valueOf)
                         .collect(Collectors.joining());

        System.out.println("Result: " + result);
        scanner.close();
    }
}
// This code uses Java Streams to remove specific characters from a string.
// It reads two strings from the user: the original string and the string containing characters to remove.
// It creates a Set of characters to be removed for efficient lookup.
// The program processes the original string, filtering out characters that are in the removal set,
// and collects the remaining characters into a new string, which is then printed to the console.