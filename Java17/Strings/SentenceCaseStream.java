import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SentenceCaseStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String result = Arrays.stream(input.trim().split("\\s+"))
                .map(word -> word.isEmpty() ? "" :
                     Character.toUpperCase(word.charAt(0)) +
                     word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));

        System.out.println("Sentence Case: " + result);
        scanner.close();
    }
}
// This code converts a given sentence to sentence case using Java Streams.
// It reads a sentence from the user, splits it into words, capitalizes the first letter of each word,
// and converts the rest of the letters to lowercase. The result is then printed to the console.
// The program handles multiple spaces between words and trims leading/trailing spaces.