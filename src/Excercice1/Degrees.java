package Excercice1;

public abstract class Degrees implements Convertible  {
    protected Float degrees;
    protected DegreeSystem system;

    public Degrees(Float degreesCelcius, DegreeSystem system) {
        this.degrees = degreesCelcius;
        this.system = system;
    }

    protected String getSystemAnnotation (){
        return switch (system) {
            case DegreeSystem.celcius -> "C";
            case DegreeSystem.farenheit -> "F";
        };
    }

    public Degrees convertTo(DegreeSystem system)  {
        if(system.equals(this.system)) {
            throw new RuntimeException(String.format("We already have a %s system", system));
        }
        return switch (system) {
            case DegreeSystem.celcius -> new CelciusDegrees(this.toCelcius());
            case DegreeSystem.farenheit -> new FarenheitDegrees((float) (this.toCelcius()  * 1.8 +32));
        };
    }

    public String toString() {
        return String.format("%f degree(s) %s", this.degrees, this.getSystemAnnotation());
    }
}
