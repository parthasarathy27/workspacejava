import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.err.println("Welcome to My CalculatorApp");
            System.err.println("***************************");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            System.err.println("***************************");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition(scanner);
                    break;
                case 2:
                    performSubtraction(scanner);
                    break;
                case 3:
                    performMultiplication(scanner);
                    break;
                case 4:
                    performDivision(scanner);
                    break;
                case 5:
                    System.out.println("Thank you for using the calculator. Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 5);

        scanner.close();
    }

    private static void performAddition(Scanner scanner) {
        System.out.print("Enter first value: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second value: ");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
    }

    private static void performSubtraction(Scanner scanner) {
        System.out.print("Enter first value: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second value: ");
        int num2 = scanner.nextInt();
        int result = num1 - num2;
        System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + result);
    }

    private static void performMultiplication(Scanner scanner) {
        System.out.print("Enter first value: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second value: ");
        int num2 = scanner.nextInt();
        int result = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is " + result);
    }

    private static void performDivision(Scanner scanner) {
        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();

        if (denominator != 0) {
            double result = (double) numerator / denominator;
            System.out.println("The division of " + numerator + " by " + denominator + " is " + result);
        } else {
            System.out.println("Error: Division by zero is undefined.");
        }
    }
}
