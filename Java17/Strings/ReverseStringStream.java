import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = IntStream.range(0, input.length())
                                   .mapToObj(i -> String.valueOf(input.charAt(input.length() - 1 - i)))
                                   .collect(Collectors.joining());

        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
}
