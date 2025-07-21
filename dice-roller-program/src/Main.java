import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.println("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {
            // ROLL DICE
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total is: " + total);
        } else {
            System.out.println("# of dice must be greater than 0");
        }
    }

    static void printDie(int roll) {
        String firstDice = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String secondDice = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String thirdDice = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String fourthDice = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String fifthDice = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String sixthDice = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (roll) {
            case 1 -> System.out.print(firstDice);
            case 2 -> System.out.print(secondDice);
            case 3 -> System.out.print(thirdDice);
            case 4 -> System.out.print(fourthDice);
            case 5 -> System.out.print(fifthDice);
            case 6 -> System.out.print(sixthDice);
            default -> System.out.println("Invalid Roll");
        }
    }
}