import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0, temp = Math.abs(number); // handle negative numbers

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}
