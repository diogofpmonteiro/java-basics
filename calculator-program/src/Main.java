import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.println("Enter the first number: ");
        firstNumber = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        secondNumber = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> {
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by 0");
                    validOperation = false;
                } else {
                    result = firstNumber / secondNumber;
                }
            }
            case '^' -> result = Math.pow(firstNumber, secondNumber);
            default -> {
                System.out.println("Invalid operator");
                validOperation = false;
            }
        }

        if (validOperation) {
            System.out.println(result);
        }

        scanner.close();
    }
}