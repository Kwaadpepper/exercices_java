package Excercice1;

public class CelciusDegrees extends Degrees {
    public CelciusDegrees(Integer degrees) {
        super(degrees, DegreeSystem.celcius);
    }

    public Integer toCelcius() {
        return this.degrees;
    }
}
