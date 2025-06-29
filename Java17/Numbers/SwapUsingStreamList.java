import java.util.*;
import java.util.stream.Collectors;

public class SwapUsingStreamList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        // Put numbers in a list
        List<Integer> numbers = Arrays.asList(a, b);

        System.out.println("Before swap: a = " + numbers.get(0) + ", b = " + numbers.get(1));

        // Swap using Collections.swap
        Collections.swap(numbers, 0, 1);

        System.out.println("After swap:  a = " + numbers.get(0) + ", b = " + numbers.get(1));
        scanner.close();
    }
}
