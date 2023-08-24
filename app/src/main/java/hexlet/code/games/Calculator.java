package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    private static final int RANDOM_NUMBERS_RANGE = 10;
    private static final int NUM_COLUMNS = 2;
    private static final int NUM_ROWS = Engine.ROUNDS_NUMBER;
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPERATORS_LIST = {'+', '-', '*'};

    public static void game() {
        String[][] answersAndQuestion = new String[NUM_ROWS][NUM_COLUMNS];

        for (String[] element : answersAndQuestion) {
            int operand1 = Utils.randomNumbersGenerator(RANDOM_NUMBERS_RANGE) + 1;
            int operand2 = Utils.randomNumbersGenerator(RANDOM_NUMBERS_RANGE) + 1;
            int operatorIndex = Utils.randomNumbersGenerator(OPERATORS_LIST.length);

            switch (OPERATORS_LIST[operatorIndex]) {
                case '+' -> {
                    element[0] = operand1 + " " + OPERATORS_LIST[operatorIndex] + " " + operand2;
                    element[1] = String.valueOf(operand1 + operand2);
                }
                case '-' -> {
                    element[0] = operand1 + " " + OPERATORS_LIST[operatorIndex] + " " + operand2;
                    element[1] = String.valueOf(operand1 - operand2);
                }
                case '*' -> {
                    element[0] = operand1 + " " + OPERATORS_LIST[operatorIndex] + " " + operand2;
                    element[1] = String.valueOf(operand1 * operand2);
                }
                default -> System.out.print("Unknown operator.");
            }
        }
        Engine.startGame(answersAndQuestion, GAME_DESCRIPTION);
    }
}
