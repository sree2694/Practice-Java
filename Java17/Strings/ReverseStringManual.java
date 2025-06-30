import java.util.Scanner;

public class ReverseStringManual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // not efficient for large strings
        }

        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
}
