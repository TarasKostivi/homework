package homeWork5.Car;

public class CarBody extends Car {
    private double sizeCarBody;
    private double widthCarBody;
    
    public CarBody(String model, int year, String color, double sizeCarBody, double widthCarBody) {
        super(model, year, color);
        this.sizeCarBody = sizeCarBody;
        this.widthCarBody = widthCarBody;
    }

    public double getSizeCarBody() {
        return sizeCarBody;
    }

    public void setSizeCarBody(double sizeCarBody) {
        this.sizeCarBody = sizeCarBody;
    }

    public double getWidthCarBody() {
        return widthCarBody;
    }

    public void setWidthCarBody(double widthCarBody) {
        this.widthCarBody = widthCarBody;
    }

    public void sizeBody(){
    }
}
