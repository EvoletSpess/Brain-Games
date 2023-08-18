package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final int RANDOM_NUMBER_RANGE = 30;

    public static void game() {
        int rowCount = Engine.ROUNDS_NUMBER;
        int columnCount = 2;
        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[][] answersAndQuestion = new String[rowCount][columnCount];

        for (String[] element : answersAndQuestion) {
            int randIntOne = Utils.randomNumbersGenerator(RANDOM_NUMBER_RANGE) + 1;
            int randIntTwo = Utils.randomNumbersGenerator(RANDOM_NUMBER_RANGE) + 1;
            element[0] = randIntOne + " " + randIntTwo;
            element[1] = String.valueOf(calculateGcd(randIntOne, randIntTwo));
        }
        Engine.winOrLose(answersAndQuestion, gameDescription);
    }

    public static int calculateGcd(int a, int b) {
        var gcd = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
