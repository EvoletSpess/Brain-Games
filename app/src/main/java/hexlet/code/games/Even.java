package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int RANDOM_NUMBER_RANGE = 30;
    private static final int NUM_COLUMNS = 2;
    private static final int NUM_ROWS = Engine.ROUNDS_NUMBER;
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void game() {
        String[][] answersAndQuestion = new String[NUM_ROWS][NUM_COLUMNS];

        for (String[] element : answersAndQuestion) {
            int question = Utils.randomNumbersGenerator(RANDOM_NUMBER_RANGE) + 1;
            element[0] = String.valueOf(question);
            element[1] = isEven(question) ? "yes" : "no";
        }
        Engine.startGame(answersAndQuestion, GAME_DESCRIPTION);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
