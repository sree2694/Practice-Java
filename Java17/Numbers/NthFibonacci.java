import java.util.Scanner;

public class NthFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter position (N): ");
        int n = scanner.nextInt();

        int result = findNthFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);

        scanner.close();
    }

    public static int findNthFibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
}
