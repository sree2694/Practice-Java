import java.util.Scanner;
import java.util.stream.IntStream;

public class GCDUsingStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int gcd = IntStream.rangeClosed(1, Math.min(a, b))
                           .filter(i -> a % i == 0 && b % i == 0)
                           .max()
                           .orElse(1);

        int lcm = (a * b) / gcd;

        System.out.println("GCD (via Stream): " + gcd);
        System.out.println("LCM (via Formula): " + lcm);

        scanner.close();
    }
}
