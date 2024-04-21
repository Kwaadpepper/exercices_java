package Excercice1;

public class CelciusDegrees extends Degrees {
    public CelciusDegrees(Float degreesCelcius) {
        super(degreesCelcius, DegreeSystem.celcius);
    }

    public Float toCelcius() {
        return this.degrees;
    }
}
