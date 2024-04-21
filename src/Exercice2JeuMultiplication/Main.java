package Exercice2JeuMultiplication;

import java.util.*;

public class Main {
    public static void main(String[] argv) {
        int multNumCount = 2;
        var numbers = new ArrayList<Integer>();
        StringBuilder multiplicationQuestion = new StringBuilder();
        for (int i = 0; i < multNumCount; i++) {
            if(i > 0) {
                multiplicationQuestion.append(" par ");
            }
            var randomNumber = Main.getRandowmNumber(9);
            numbers.add(randomNumber);
            multiplicationQuestion.append(randomNumber);
        }
        Optional<Integer> result = numbers.stream().reduce((a, b) -> a * b);
        Integer userResult = Main.getInput(String.format("Combien font %s ?", multiplicationQuestion));

        if (result.equals(Optional.of(userResult))) {
            System.out.print("Bravo !!");
        } else {
            System.out.printf("La bonne réponse était %d", result.orElse(0));
        }
    }

    private static Integer getRandowmNumber(Integer max) {
        Random rand = new Random();
        return rand.nextInt(0, max);
    }

    private static Integer getInput(String message) {
        System.out.println(message);
        return Main.getInput();
    }

    private static Integer getInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
