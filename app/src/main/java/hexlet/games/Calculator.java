package hexlet.games;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void game() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("What is the result of the expression?");
        var i = 0;
        boolean isWinner = true;
        while (i < 3) {
            Random rand = new Random();
            int randIntOne = rand.nextInt(10);
            int randIntTwo = rand.nextInt(10);
            int randIntOperator = rand.nextInt(3);
            int result = calculateResult(randIntOperator, randIntOne, randIntTwo);

            if (randIntOperator == 0) {
                System.out.println("Question: " + randIntOne + " + " + randIntTwo);
            } else if (randIntOperator == 1) {
                System.out.println("Question: " + randIntOne + " - " + randIntTwo);
            } else {
                System.out.println("Question: " + randIntOne + " * " + randIntTwo);
            }

            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(String.valueOf(result))) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println('\''
                        + answer
                        + '\''
                        + " is wrong answer ;(. Correct answer was "
                        + '\'' + result
                        + "'.");
                System.out.println("Let's try again, " + userName + "!");
                isWinner = false;
                scanner.close();
                break;
            }
        }
        if (isWinner) {
            System.out.println("Congratulations, " + userName + "!");
        }
        scanner.close();
    }

    public static int calculateResult(int operator, int operandOne, int operandTwo) {
        return switch (operator) {
            case 0 -> operandOne + operandTwo;
            case 1 -> operandOne - operandTwo;
            case 2 -> operandOne * operandTwo;
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }
}
