
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Prompt the user for two numbers
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        // Calculate the values for +, -, /, *
        int additionResult = firstNumber + secondNumber;
        int subtractionResult = firstNumber - secondNumber;
        int multiplicationResult = firstNumber * secondNumber;
        double divisionResult = 1.0 * firstNumber / secondNumber;
        // Print operations and outputs for +, -, /, *
        System.out.println(firstNumber + " + " + secondNumber + " = " + additionResult);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtractionResult);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplicationResult);
        System.out.println(firstNumber + " / " + secondNumber + " = " + divisionResult);
    }
}
