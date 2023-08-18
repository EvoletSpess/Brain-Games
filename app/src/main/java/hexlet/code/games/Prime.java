package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int RANDOM_NUMBER_RANGE = 100;

    public static void game() {
        int rowCount = Engine.ROUNDS_NUMBER;
        int columnCount = 2;
        String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] answersAndQuestion = new String[rowCount][columnCount];

        for (String[] element : answersAndQuestion) {
            int question = Utils.randomNumbersGenerator(RANDOM_NUMBER_RANGE) + 1;
            element[0] = String.valueOf(question);

            if (isPrime(question)) {
                element[1] = "yes";
            } else {
                element[1] = "no";
            }
        }
        Engine.winOrLose(answersAndQuestion, gameDescription);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
