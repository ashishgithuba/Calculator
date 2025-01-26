
    import java.util.Scanner;

public class cal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Ask the user to choose an operation
        System.out.println("Choose an operation: +, -, *, /");
        char operation = sc.next().charAt(0);

        // Perform the chosen operation
        int result = 0;
        boolean valid = true; // To check for valid operations

        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose +, -, *, or /.");
                valid = false;
        }

        // Display the result if the operation is valid
        if (valid) {
            System.out.println("Result: " + result);
        }
    }
}


