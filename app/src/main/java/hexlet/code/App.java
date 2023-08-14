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
            case "1" -> Engine.greetUser(scanner);
            case "2" -> {
                System.out.println();
                Even.game(scanner);
            }
            case "3" -> {
                System.out.println();
                Calculator.game(scanner);
            }
            case "4" -> {
                System.out.println();
                GCD.game(scanner);
            }
            case "5" -> {
                System.out.println();
                Progression.game(scanner);
            }
            case "6" -> {
                System.out.println();
                Prime.game(scanner);
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
