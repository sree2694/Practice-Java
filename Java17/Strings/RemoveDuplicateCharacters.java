import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }

    public static String removeDuplicates(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (seen.add(c)) { // add returns false if character already exists
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
