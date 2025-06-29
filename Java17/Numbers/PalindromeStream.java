import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromeStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.next();

        boolean isPalindrome = isPalindrome(number);

        if (isPalindrome) {
            System.out.println(number + " is a Palindrome number.");
        } else {
            System.out.println(number + " is NOT a Palindrome number.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String number) {
        return IntStream.range(0, number.length() / 2)
                .allMatch(i -> number.charAt(i) == number.charAt(number.length() - 1 - i));
    }
}
