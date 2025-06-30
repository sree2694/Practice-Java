import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromeStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        boolean isPalindrome = IntStream.range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - 1 - i));

        System.out.println(str + (isPalindrome ? " is a Palindrome." : " is NOT a Palindrome."));
        scanner.close();
    }
}
