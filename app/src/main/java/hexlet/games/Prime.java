package hexlet.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class Prime {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        String userName = Engine.greetUser(scanner);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        final int roundsNumber = 3;
        final int randomNumberRange = 100;

        var i = 0;
        while (i < roundsNumber) {
            int question = Utils.randomNumbersGenerator(randomNumberRange) + 1;

            var result = calculateResult(question);

            String answer = Engine.questionAndAnswer(String.valueOf(question), scanner);

            if (Engine.winOrLose(result, answer, userName)) {
                i++;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }

    public static String calculateResult(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            return "yes";
        } else {
            return "no";
        }
    }
}
