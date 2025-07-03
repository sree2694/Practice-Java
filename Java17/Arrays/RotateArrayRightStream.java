import java.util.*;
import java.util.stream.*;

public class RotateArrayRightStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                                   .map(Integer::parseInt)
                                   .collect(Collectors.toList());

        System.out.print("Enter K (positions to rotate): ");
        int k = scanner.nextInt();
        int n = list.size();
        k %= n;

        List<Integer> rotated = Stream.concat(
                list.subList(n - k, n).stream(),
                list.subList(0, n - k).stream()
        ).collect(Collectors.toList());

        System.out.println("Rotated array (right): " + rotated);
        scanner.close();
    }
}
// This program rotates an array to the right by K positions using Java Streams.
// It reads the array elements from the user, calculates the effective rotation,
// and then constructs a new list by concatenating the last K elements with the rest.
// The result is printed to the console. The program handles cases where K is greater than the array length by using modulo operation.