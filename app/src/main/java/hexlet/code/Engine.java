package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;

    private static String greetUser(String gameDescription, Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameDescription);
        return userName;
    }

    public static void startGame(String[][] answersAndQuestions, String gameDescription) {
        Scanner scanner = new Scanner(System.in);
        String userName = greetUser(gameDescription, scanner);

        for (String[] element : answersAndQuestions) {
            System.out.println("Question: " + element[0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(element[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println('\''
                        + answer
                        + '\''
                        + " is wrong answer ;(. Correct answer was "
                        + '\''
                        + element[1]
                        + "'.");
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        System.exit(0);
    }
}
