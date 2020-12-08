package homeWork4;

public class Main1 {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(10, 2);

        rectangle1.getPerimeter();
        rectangle1.getArea(); 
        rectangle1.setLength(10);
        rectangle1.setWight(2);
        rectangle1.print();
    }
}
