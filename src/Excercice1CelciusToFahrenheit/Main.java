package Excercice1CelciusToFahrenheit;

import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        var celcius = new CelciusDegrees(Main.getInput(DegreeSystem.celcius));
        System.out.printf("Converted is %s from %f C%n", celcius.convertTo(DegreeSystem.fahrenheit).toString(), celcius.toCelcius());
        var farenheit = new FahrenheitDegrees(Main.getInput(DegreeSystem.fahrenheit));
        System.out.printf("Converted is %s%n", farenheit.convertTo(DegreeSystem.celcius).toString());
    }

    private static Float getInput(DegreeSystem system) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Type a %s degree to convert%n", system);
        return scan.nextFloat();
    }
}