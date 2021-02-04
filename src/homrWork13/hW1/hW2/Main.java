package homrWork13.hW1.hW2;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lamborgini", 2);
        Car car2 = new Car("Audi a4", 4);
        Car car3 = new Car("Ford", 7);
        Car car4 = new Car("Dord fiesta", 8);
        Car car5 = new Car("Uord focus", 3);

        List<Car> someCar = new LinkedList<>();
        someCar.add(car1);
        someCar.add(car2);
        someCar.add(car3);
        someCar.add(car4);
        someCar.add(car5);

        printList(someCar);

        Collections.sort(someCar);
        printList(someCar);

        HashSet<Car> someCar2 = new HashSet<>();
        someCar2.add(car1);
        someCar2.add(car2);
        someCar2.add(car3);
        someCar2.add(car4);
        someCar2.add(car5);

        Collections.sort(someCar);
        for (Car strSort2: someCar2) {
            System.out.println(strSort2);
        }

        LinkedHashSet<Car> someCar3  = new LinkedHashSet<>();
        someCar3.add(car1);
        someCar3.add(car2);
        someCar3.add(car3);
        someCar3.add(car4);
        someCar3.add(car5);

        for (Car strSort2: someCar3) {
            System.out.println(strSort2);
        }

        TreeSet<Car> someCar4 = new TreeSet<>();
        someCar4.add(car1);
        someCar4.add(car2);
        someCar4.add(car3);
        someCar4.add(car4);
        someCar4.add(car5);

        for (Car strSort2: someCar4) {
            System.out.println(strSort2);
        }


    }
    private static void printList(List<?> list){
        for (Object elem : list) {
            System.out.println(elem + " ");
        }
        System.out.println();
    }
}
