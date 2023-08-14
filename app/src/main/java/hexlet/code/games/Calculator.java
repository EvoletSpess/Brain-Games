package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class Calculator {
    public static final int RANDOM_OPERAND_RANGE = 3;
    public static final int RANDOM_NUMBERS_RANGE = 10;

    public static void game(Scanner scanner) {
        String userName = Engine.greetUser("What is the result of the expression?", scanner);

        for (var i = 0; true; i++) {
            int randIntOne = Utils.randomNumbersGenerator(RANDOM_NUMBERS_RANGE) + 1;
            int randIntTwo = Utils.randomNumbersGenerator(RANDOM_NUMBERS_RANGE) + 1;
            int randIntOperator = Utils.randomNumbersGenerator(RANDOM_OPERAND_RANGE);
            String result = String.valueOf(calculateResult(randIntOperator, randIntOne, randIntTwo));

            String question = randIntOne + operandResult(randIntOperator) + randIntTwo;

            Engine.winOrLose(question, result, userName, scanner, i);
            i++;
        }
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
