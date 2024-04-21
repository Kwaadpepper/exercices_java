package Excercice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        var celcius = new CelciusDegrees(Main.getInput(DegreeSystem.celcius));
        System.out.printf("Converted is %s from %f C%n", celcius.convertTo(DegreeSystem.farenheit).toString(), celcius.toCelcius());
        var farenheit = new FarenheitDegrees(Main.getInput(DegreeSystem.farenheit));
        System.out.printf("Converted is %s%n", farenheit.convertTo(DegreeSystem.celcius).toString());
    }

    private static Float getInput(DegreeSystem system) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Type a %s degree to convert%n", system);
        return scan.nextFloat();
    }
}