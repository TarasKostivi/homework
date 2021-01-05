package homeWork5.Car;

public class MainCar {
    public static void main(String[] args) {

        Wheel wheel = new Wheel("PREMIORRI", "Econom", "Winter", 2.3);
        CarBody carBody = new CarBody(20.2,30.4,50.6);
        Helm helm = new Helm("Sport", 20.3);


        wheel.pomp();
        carBody.print();
        helm.changeDiameter();

    }
}

