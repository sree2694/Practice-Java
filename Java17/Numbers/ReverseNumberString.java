import java.util.Scanner;

public class ReverseNumberString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String number = scanner.next();

        String reversed = new StringBuilder(number).reverse().toString();
        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}
