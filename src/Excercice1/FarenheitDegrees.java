package Excercice1;

public class FarenheitDegrees extends Degrees {
    public FarenheitDegrees(Float degreesCelcius) {
        super(degreesCelcius, DegreeSystem.farenheit);
    }

    public Float toCelcius() {
        return ((this.degrees  - 32) * 5) /9;
    }
}
