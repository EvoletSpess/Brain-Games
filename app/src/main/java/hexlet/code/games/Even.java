package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int RANDOM_NUMBER_RANGE = 30;

    public static void game() {
        int rowCount = Engine.ROUNDS_NUMBER;
        int columnCount = 2;
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] answersAndQuestion = new String[rowCount][columnCount];

        for (String[] element : answersAndQuestion) {
            int question = Utils.randomNumbersGenerator(RANDOM_NUMBER_RANGE) + 1;
            element[0] = String.valueOf(question);

            if (isEven(question)) {
                element[1] = "yes";
            } else {
                element[1] = "no";
            }
        }
        Engine.winOrLose(answersAndQuestion, gameDescription);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
