import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseNumberStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String number = scanner.next();

        String reversed = new StringBuilder(
                number.chars()
                      .mapToObj(c -> String.valueOf((char) c))
                      .collect(Collectors.joining())
        ).reverse().toString();

        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}
