package Excercice1CelciusToFahrenheit;

public class FahrenheitDegrees extends Degrees {
    public FahrenheitDegrees(Float degreesCelcius) {
        super(degreesCelcius, DegreeSystem.fahrenheit);
    }

    public Float toCelcius() {
        return ((this.degrees  - 32) * 5) /9;
    }
}
