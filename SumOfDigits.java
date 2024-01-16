import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Initialize a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Find the sum of digits
        int sum = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        // Display the result
        System.out.println("Sum of digits in " + originalNumber + " is: " + sum);
    }
}
