package homeWork5.Car;

public class Helm extends Car {
       private double helmDiameter;


    public Helm(String model, int year, String color, double helmDiameter) {
        super(model, year, color);

        this.helmDiameter = helmDiameter;
    }

    public double getHelmDiameter() {
        return helmDiameter;
    }

    public void setHelmDiameter(double helmDiameter) {
        this.helmDiameter = helmDiameter;
    }


    public double helmDiameter(){
        return helmDiameter * helmDiameter / 4 * 3.14;
    }
}
