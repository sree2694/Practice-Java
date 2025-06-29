import java.util.Scanner;

public class FactorialRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        long result = factorialRecursive(n);
        System.out.println("Factorial of " + n + " is: " + result);

        scanner.close();
    }

    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }
}
