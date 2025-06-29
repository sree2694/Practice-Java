import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeCheckerStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();
        
        boolean isPrime = isPrime(number);
        
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        scanner.close();
    }

    // Stream-based Prime Check
    public static boolean isPrime(int num) {
        return num > 1 &&
               IntStream.rangeClosed(2, (int)Math.sqrt(num))
                        .noneMatch(i -> num % i == 0);
    }
}
