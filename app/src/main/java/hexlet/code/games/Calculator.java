package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    public static final int RANDOM_OPERAND_RANGE = 3;
    public static final int RANDOM_NUMBERS_RANGE = 10;

    public static void game() {
        int rowCount = Engine.ROUNDS_NUMBER;
        int columnCount = 2;
        String gameDescription = "What is the result of the expression?";
        String[][] answersAndQuestion = new String[rowCount][columnCount];

        for (String[] element : answersAndQuestion) {
            int randIntOne = Utils.randomNumbersGenerator(RANDOM_NUMBERS_RANGE) + 1;
            int randIntTwo = Utils.randomNumbersGenerator(RANDOM_NUMBERS_RANGE) + 1;
            int randIntOperator = Utils.randomNumbersGenerator(RANDOM_OPERAND_RANGE);

            element[0] = randIntOne + operandResult(randIntOperator) + randIntTwo;
            element[1] = String.valueOf(calculateResult(randIntOperator, randIntOne, randIntTwo));
        }
        Engine.winOrLose(answersAndQuestion, gameDescription);
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
