package hexlet.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class Even {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        String userName = Engine.greetUser(scanner);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var i = 0;
        while (i < 3) {
            int question = Utils.randomNumbersGenerator(1000);
            String result;
            if (question % 2 == 0) {
                result = "yes";
            } else {
                result = "no";
            }

            String answer = Engine.questionAndAnswer(String.valueOf(question), scanner);

            if (Engine.winOrLose(result, answer, userName)) {
                i++;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
