package Excercice1;

public abstract class Degrees implements Convertible  {
    protected Integer degrees;
    protected DegreeSystem system;

    public Degrees(Integer degrees, DegreeSystem system) {
        this.degrees = degrees;
        this.system = system;
    }

    protected String getSystemAnnotation (){
        return switch (system) {
            case DegreeSystem.celcius -> "C";
            case DegreeSystem.farenheit -> "F";
            default -> throw new RuntimeException("Unhandled TP1.DegreeSystem");
        };
    }

    public Degrees convertTo(DegreeSystem system)  {
        return switch (system) {
            case DegreeSystem.celcius -> new CelciusDegrees(this.toCelcius());
            case DegreeSystem.farenheit -> new FarenheitDegrees(this.toCelcius());
            default -> throw new RuntimeException(String.format("System %s not handled", system));
        };
    }

    public String toString() {
        return String.format("%d degree(s) %s", this.degrees, this.getSystemAnnotation());
    }
}
