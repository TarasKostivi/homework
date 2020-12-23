package homeWork4;

public class Main2 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10, 10);

        circle1.getArea();
        circle1.getLength();
        circle1.setRadius(10);
        circle1.setDiameter(10);
        circle1.print();
    }
}
