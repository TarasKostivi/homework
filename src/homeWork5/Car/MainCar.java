package homeWork5.Car;

public class MainCar {
    public static void main(String[] args) {
       Car car1 = new Car("sdfsd", 2020, "df");
       Helm helm2 = new Helm("dsf",2009, "blue", 4);
       Wheel wheel3 = new Wheel("S", 2020, "Green", 30);
       CarBody carBody4 = new CarBody("S", 2020, "Green", 30, 40);

       car1.start();
       helm2.setHelmDiameter(10);
       wheel3.setSizeWheel(10);
       carBody4.setSizeCarBody(5);
       carBody4.setWidthCarBody(5);

       helm2.helmDiameter();
       wheel3.bigSizeWheel();
       carBody4.sizeBody();

    }
}

