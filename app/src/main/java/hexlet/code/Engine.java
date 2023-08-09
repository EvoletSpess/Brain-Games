package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String greetUser(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static boolean winOrLose(String answer, String result, String userName) {
        if (answer.equals(result)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println('\''
                    + result
                    + '\''
                    + " is wrong answer ;(. Correct answer was "
                    + '\''
                    + answer
                    + "'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
            return false;
        }
    }

    public static String questionAndAnswer(String question, Scanner scanner) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        return scanner.next();
    }
}
