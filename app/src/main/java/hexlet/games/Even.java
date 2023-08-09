package hexlet.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class Even {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        String userName = Engine.greetUser(scanner);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var roundsNumber = 3;
        var randomNumberRange = 30;

        var i = 0;
        while (i < roundsNumber) {
            int question = Utils.randomNumbersGenerator(randomNumberRange);

            var result = calculateResult(question);

            String answer = Engine.questionAndAnswer(String.valueOf(question), scanner);

            if (Engine.winOrLose(result, answer, userName)) {
                i++;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }

    public static String calculateResult(int question) {
        if (question % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
