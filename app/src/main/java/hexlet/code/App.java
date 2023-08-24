package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = mainMenu(scanner);

        switch (choice) {
            case "0" -> {
            }
            case "1" -> {
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                String userName = scanner.next();
                System.out.println("Hello, " + userName + "!");
                System.exit(0);
            }
            case "2" -> {
                System.out.println();
                Even.game();
            }
            case "3" -> {
                System.out.println();
                Calculator.game();
            }
            case "4" -> {
                System.out.println();
                GCD.game();
            }
            case "5" -> {
                System.out.println();
                Progression.game();
            }
            case "6" -> {
                System.out.println();
                Prime.game();
            }
            default -> System.out.println("Wrong input. Please try again.");
        }
    }
    public static String mainMenu(Scanner scanner) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        return scanner.next();
    }
}
