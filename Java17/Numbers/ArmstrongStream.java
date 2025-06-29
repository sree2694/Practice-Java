import java.util.Scanner;
import java.util.stream.IntStream;

public class ArmstrongStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.next();
        int original = Integer.parseInt(number);
        int power = number.length(); // number of digits

        int sum = number.chars()
                .map(c -> Character.getNumericValue(c))
                .map(d -> (int) Math.pow(d, power))
                .sum();

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

        scanner.close();
    }
}
