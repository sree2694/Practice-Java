import java.util.Scanner;

public class SumOfDigitsStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.next();

        int sum = number.chars()
                        .filter(Character::isDigit) // ignore '-' or other characters
                        .map(c -> Character.getNumericValue(c))
                        .sum();

        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}
