import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        Map<String, Long> wordFreq = Arrays.stream(input.toLowerCase().split("\\W+"))
            .filter(word -> !word.isBlank())
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Word Frequencies (Stream):");
        wordFreq.forEach((word, count) -> System.out.println(word + " → " + count));

        scanner.close();
    }
}
