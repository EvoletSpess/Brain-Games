package hexlet.code;

import java.util.Scanner;

import hexlet.games.Calculator;
import hexlet.games.Even;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String choice = scanner.next();

        switch (choice) {
            case "0" -> {
            }
            case "1" -> {
                System.out.println();
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                String userName = scanner.next();
                System.out.println("Hello, " + userName + "!");
                scanner.close();
            }
            case "2" -> {
                System.out.println();
                Even.game();
            }
            case "3" -> {
                System.out.println();
                Calculator.game();
            }
            default -> System.out.println("Wrong input. Please try again.");
        }
    }
}
