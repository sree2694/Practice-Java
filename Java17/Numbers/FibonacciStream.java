import java.util.Scanner;
import java.util.stream.Stream;

public class FibonacciStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms (N): ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");
        
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
              .limit(n)
              .map(t -> t[0])
              .forEach(num -> System.out.print(num + " "));

        scanner.close();
    }
}
