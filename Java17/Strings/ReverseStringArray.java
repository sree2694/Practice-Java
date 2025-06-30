import java.util.Scanner;

public class ReverseStringArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();
        int start = 0, end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        String reversed = new String(chars);
        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
}
