import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = input.toLowerCase().split("\\W+"); // split by non-word characters
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies:");
        wordCount.forEach((k, v) -> System.out.println(k + " → " + v));

        scanner.close();
    }
}
// This program reads a sentence from the user and calculates the frequency of each word in the sentence,
// ignoring case and punctuation. It uses a HashMap to store the word frequencies and prints them out in a readable format.
// The input is split into words using a regular expression that matches non-word characters, ensuring that punctuation does not affect the word count.