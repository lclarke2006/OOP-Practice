public class Spheres {
    private double diameter;
    private double volume;
    private double sa;

    public Spheres(double diameter) {
        this.diameter = diameter;
    }

    public double calculateVolume() {
        volume = (double) 4/3 * Math.PI * ((diameter / 2) * (diameter / 2) * (diameter / 2));
        return volume;
    }

    public double calculateSa() {
        sa = 4 * Math.PI * ((diameter / 2) * (diameter / 2));
        return sa;
    }


    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Spheres{" +
                "diameter=" + diameter +
                ", volume=" + volume +
                ", sa=" + sa +
                '}';
    }
}
