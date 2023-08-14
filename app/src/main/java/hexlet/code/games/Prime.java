package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class Prime {
    public static final int RANDOM_NUMBER_RANGE = 100;

    public static void game(Scanner scanner) {
        String userName = Engine.greetUser("Answer 'yes' if given number is prime. Otherwise answer 'no'.", scanner);

        for (var i = 0; true; i++) {
            int question = Utils.randomNumbersGenerator(RANDOM_NUMBER_RANGE) + 1;

            String result;

            if (isPrime(question)) {
                result = "yes";
            } else {
                result = "no";
            }

            Engine.winOrLose(String.valueOf(question), result, userName, i);
            i++;
        }
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
