package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class GCD {
    public static final int RANDOM_NUMBER_RANGE = 30;

    public static void game(Scanner scanner) {
        String userName = Engine.greetUser("Find the greatest common divisor of given numbers.", scanner);

        for (var i = 0; true; i++) {
            int randIntOne = Utils.randomNumbersGenerator(RANDOM_NUMBER_RANGE) + 1;
            int randIntTwo = Utils.randomNumbersGenerator(RANDOM_NUMBER_RANGE) + 1;

            String result = String.valueOf(calculateGcd(randIntOne, randIntTwo));

            String question = randIntOne + " " + randIntTwo;

            Engine.winOrLose(question, result, userName, i);
            i++;
        }
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
