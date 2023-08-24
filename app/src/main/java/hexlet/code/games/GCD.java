package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final int RANDOM_NUMBER_RANGE = 30;
    private static final int NUM_COLUMNS = 2;
    private static final int NUM_ROWS = Engine.ROUNDS_NUMBER;
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void game() {
        String[][] answersAndQuestion = new String[NUM_ROWS][NUM_COLUMNS];

        for (String[] element : answersAndQuestion) {
            int randIntOne = Utils.randomNumbersGenerator(RANDOM_NUMBER_RANGE) + 1;
            int randIntTwo = Utils.randomNumbersGenerator(RANDOM_NUMBER_RANGE) + 1;
            element[0] = randIntOne + " " + randIntTwo;
            element[1] = String.valueOf(calculateGcd(randIntOne, randIntTwo));
        }
        Engine.startGame(answersAndQuestion, GAME_DESCRIPTION);
    }

    private static int calculateGcd(int a, int b) {
        var gcd = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
