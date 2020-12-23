package homeWork4;

public class Circle {
    private double radius;
    private double diameter;


    Circle(){

    }
    Circle(double radius, double diameter){
        this.diameter = diameter;
        this.radius = radius;
    }

    public double getDiameter(){
        return this.diameter;
    }
    public void setDiameter(double diameter){
        this.diameter = diameter;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }


    public double getArea(){
        return diameter + diameter / 4 * 3.14;
    }
    public double getLength(){
        return 3.14 * radius + radius;
    }

    public void print(){
        System.out.println("Area : " + getArea());
        System.out.println("Length : " + getLength());
    }
}
