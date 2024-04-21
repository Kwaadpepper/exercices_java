package Exercice3JeuDevinette;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        final int MIN = 1;
        final int MAX = 1000;
        var computer = Main.getRandowmNumber(MIN, MAX);
        System.out.printf("Essayez de deviner un nombre entre %d et %d%n", MIN, MAX);
        if(Main.guessNumber(computer, 0)) {
            System.out.println("C'est gagné !");
            return;
        }
        System.out.println("Player 0 loose, insert coin");
    }

    private static Boolean guessNumber(int numberToGuess, int attempts) {
        if (attempts > 9) {
            // * Failed to guess the number
            return false;
        }
        var userAttempt = Main.getNumber();
        if(numberToGuess == userAttempt) {
            return true;
        }
        if (numberToGuess > userAttempt) {
            System.out.printf("Plus grand !%n");
            return Main.guessNumber(numberToGuess, attempts+1);
        }
        System.out.printf("Plus petit !%n");
        return Main.guessNumber(numberToGuess, attempts+1);
    }

    private static int getRandowmNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(min, max);
    }

    private static int getNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nombre : ");
        return scan.nextInt();
    }
}
