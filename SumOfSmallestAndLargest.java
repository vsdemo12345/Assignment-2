import java.util.Scanner;

public class SumOfSmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Initialize smallest and largest
        int smallest = num1;
        int largest = num1;

        // Find smallest and largest
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Calculate the sum
        int sum = smallest + largest;

        // Display the result
        System.out.println("The sum of the smallest (" + smallest + ") and largest (" + largest + ") numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
