package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;

    public static String greetUser(String gameDescription, Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameDescription);
        return userName;
    }

    public static void greetUser(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void winOrLose(String question, String result, String userName, int i) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        String answer = scanner.next();

        if (answer.equals(result)) {
            System.out.println("Correct!");
            if (i == ROUNDS_NUMBER + 1) {
                System.out.println("Congratulations, " + userName + "!");
                System.exit(0);
            }
        } else {
            System.out.println('\''
                    + answer
                    + '\''
                    + " is wrong answer ;(. Correct answer was "
                    + '\''
                    + result
                    + "'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
    }
}
