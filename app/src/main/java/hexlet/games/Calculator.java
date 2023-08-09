package hexlet.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class Calculator {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        String userName = Engine.greetUser(scanner);
        System.out.println("What is the result of the expression?");
        var roundsNumber = 3;
        var randomOperand = 3;
        var randomNumberRange = 10;

        var i = 0;
        while (i < roundsNumber) {
            int randIntOne = Utils.randomNumbersGenerator(randomNumberRange);
            int randIntTwo = Utils.randomNumbersGenerator(randomNumberRange);
            int randIntOperator = Utils.randomNumbersGenerator(randomOperand);
            String result = String.valueOf(calculateResult(randIntOperator, randIntOne, randIntTwo));

            String question = randIntOne + operandResult(randIntOperator) + randIntTwo;

            String answer = Engine.questionAndAnswer(question, scanner);

            if (Engine.winOrLose(result, answer, userName)) {
                i++;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
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

    public static String operandResult(int randIntOperator) {
        if (randIntOperator == 0) {
            return " + ";
        } else if (randIntOperator == 1) {
            return " - ";
        } else {
            return " * ";
        }
    }
}
