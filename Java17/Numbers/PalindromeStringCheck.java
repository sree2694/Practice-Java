import java.util.Scanner;

public class PalindromeStringCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numberStr = scanner.nextLine();

        String reversed = new StringBuilder(numberStr).reverse().toString();

        if (numberStr.equals(reversed)) {
            System.out.println(numberStr + " is a Palindrome number.");
        } else {
            System.out.println(numberStr + " is NOT a Palindrome number.");
        }

        scanner.close();
    }
}
