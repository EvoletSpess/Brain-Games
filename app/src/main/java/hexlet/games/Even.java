package hexlet.games;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void game() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var i = 0;
        boolean isWinner = true;
        while (i < 3) {
            Random rand = new Random();
            int randInt = rand.nextInt(1000);
            System.out.println("Question: " + randInt);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (randInt % 2 == 0) {
                if (answer.equals("yes")) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    System.out.println('\'' + answer + '\'' + " is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + userName + "!");
                    isWinner = false;
                    scanner.close();
                    break;
                }
            } else {
                if (answer.equals("no")) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    System.out.println('\'' + answer + '\'' + " is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + userName + "!");
                    isWinner = false;
                    scanner.close();
                    break;
                }
            }
        }
        if (isWinner) {
            System.out.println("Congratulations, " + userName + "!");
        }
        scanner.close();
    }
}
