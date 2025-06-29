import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int original = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit; // cube of digit
            number /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

        scanner.close();
    }
}
