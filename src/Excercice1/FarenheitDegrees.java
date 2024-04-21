package Excercice1;

public class FarenheitDegrees extends Degrees {
    public FarenheitDegrees(Integer degrees) {
        super( (degrees * 9) /5 + 32, DegreeSystem.farenheit);
    }

    public Integer toCelcius() {
        return (this.degrees - 32) * (5/9);
    }
}
