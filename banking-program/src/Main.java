import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("---------------");
            System.out.println("Banking Program");
            System.out.println("---------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("---------------");

            System.out.print("Enter an option (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> {
                    System.out.println("Exiting..");
                    isRunning = false;
                }
                default -> System.out.println("Invalid option, try an option between 1-4.");
            }
        }
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Your balance is $%.2f\n", balance);
    }

    static double deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        System.out.println("Enter the amount to withdraw");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return 0;

        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }
}