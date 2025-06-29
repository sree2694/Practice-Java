import java.util.Scanner;
import java.util.stream.LongStream;

public class FactorialStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        long result = factorialUsingStream(n);
        System.out.println("Factorial of " + n + " is: " + result);

        scanner.close();
    }

    public static long factorialUsingStream(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        return (n == 0 || n == 1) ? 1 :
                LongStream.rangeClosed(2, n)
                          .reduce(1, (a, b) -> a * b);
    }
}
