package Excercice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        var celcius = new CelciusDegrees(Main.getInput());
        System.out.printf("Converted is %s from %d C", celcius.convertTo(DegreeSystem.farenheit).toString(), celcius.toCelcius());
    }

    private static Integer getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Type a celcius degree to convert%n");
        return scan.nextInt();
    }
}