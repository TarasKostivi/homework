package homeWork5.Car;

public class CarBody {

      private double length;
      private double height;
      private double wight;

    public CarBody(double length, double height, double wight) {
        this.length = length;
        this.height = height;
        this.wight = wight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getPerimeter(){
        return 2 * (length + wight);
    }

    public void print(){
        System.out.println("Perimeter " + getPerimeter());
    }
}
