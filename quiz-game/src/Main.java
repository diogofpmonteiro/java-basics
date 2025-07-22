import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] questions = {
                "What is the capital city of Canada?",
                "What gas do plants absorb from the atmosphere?",
                "Which movie features the quote, \"I'll be back\"?",
                "Who was the first president of the United States?",
                "What does HTML stand for?"
        };
        String[][] options = {
                {"A. Toronto", "B. Vancouver", "C. Ottawa", "D. Montreal"},
                {"A. Oxygen", "B. Carbon Dioxide", "C. Nitrogen", "D. Hydrogen"},
                {"A. RoboCop", "B. Predator", "C. Die Hard", "D. Terminator"},
                {"A. Thomas Jefferson",
                        "B. John Adams",
                        "C. George Washington",
                        "D. Abraham Lincoln"},
                {"A. HyperText Markup Language",
                        "B. Home Tool Markup Language",
                        "C. Hyperlinks and Text Markup Language",
                        "D. HyperText Machine Language"}
        };

        char[] answers = {'C', 'B', 'D', 'C', 'A'};
        int score = 0;
        char guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("Welcome to the Java Quiz Game");
        System.out.println("-----------------------------");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option: options[i]) {
                System.out.println(option);
            }

            System.out.println("Enter your guess (A-D): ");
            guess = scanner.next().charAt(0);

            if (guess == answers[i]) {
                System.out.println("--------");
                System.out.println("Correct!");
                System.out.println("--------");
                score++;
            } else {
                System.out.println("--------");
                System.out.println("WRONG!");
                System.out.println("--------");
            }
        }

        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}