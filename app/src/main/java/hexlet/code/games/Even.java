package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class Even {
    public static final int RANDOM_NUMBER_RANGE = 30;

    public static void game(Scanner scanner) {
        String userName = Engine.greetUser("Answer 'yes' if the number is even, otherwise answer 'no'.", scanner);

        for (var i = 0; true; i++) {
            int question = Utils.randomNumbersGenerator(RANDOM_NUMBER_RANGE) + 1;

            String result;

            if (isEven(question)) {
                result = "yes";
            } else {
                result = "no";
            }

            Engine.winOrLose(String.valueOf(question), result, userName, scanner, i);
            i++;
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
