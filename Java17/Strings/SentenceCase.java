import java.util.Scanner;

public class SentenceCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String result = toSentenceCase(input);
        System.out.println("Sentence Case: " + result);

        scanner.close();
    }

    public static String toSentenceCase(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    sb.append(word.substring(1).toLowerCase());
                }
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }
}
// This code converts a given sentence to sentence case.
// It reads a sentence from the user, splits it into words, capitalizes the first letter of each word,
// and converts the rest of the letters to lowercase. The result is then printed to the console.
// The program handles multiple spaces between words and trims leading/trailing spaces.