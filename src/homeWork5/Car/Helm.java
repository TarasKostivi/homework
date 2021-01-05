package homeWork5.Car;

public class Helm {
    private String brand;
    private double diameter;

    public Helm(String brand, double diameter) {
        this.brand = brand;
        this.diameter = diameter;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "brand='" + brand + '\'' +
                ", diameter=" + diameter +
                '}';
    }

    public void changeDiameter(){
        this.setDiameter(this.getDiameter() * 2);
        System.out.println("Діаметер буде " + this.diameter);
    }
}
