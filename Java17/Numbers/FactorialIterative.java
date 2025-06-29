import java.util.Scanner;

public class FactorialIterative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        long result = factorialIterative(n);
        System.out.println("Factorial of " + n + " is: " + result);

        scanner.close();
    }

    public static long factorialIterative(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
