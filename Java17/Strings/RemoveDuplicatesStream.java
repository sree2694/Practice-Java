import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicatesStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = input.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println("String after removing duplicates: " + result);
        scanner.close();
    }
}
// This code uses Java Streams to remove duplicate characters from a string.
// It reads a string from the user, processes it to keep only distinct characters,
// and then collects the result into a new string which is printed to the console.