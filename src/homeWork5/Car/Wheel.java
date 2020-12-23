package homeWork5.Car;

public class Wheel extends Car {
    private double sizeWheel;

    public Wheel(String model, int year, String color, double sizeWheel) {
        super(model, year, color);
        this.sizeWheel = sizeWheel;
    }

    public double getSizeWheel() {
        return sizeWheel;
    }

    public void setSizeWheel(double sizeWheel) {
        this.sizeWheel = sizeWheel;
    }

    public void bigSizeWheel(){
        for (int i = 1; i < sizeWheel; i += 2) {
            System.out.println("size wheel " + i);
        }
    }
}
