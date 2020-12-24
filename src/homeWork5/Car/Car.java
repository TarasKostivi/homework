package homeWork5.Car;

public class Car {
    private double helm;
    private String carBody;
    private int wheel;

    public Car(){

    }

    public Car(double helm, String carBody, int wheel) {
        this.helm = helm;
        this.carBody = carBody;
        this.wheel = wheel;
    }

    public double getHelm() {
        return helm;
    }

    public void setHelm(double helm) {
        this.helm = helm;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "helm=" + helm +
                ", carBody='" + carBody + '\'' +
                ", wheel=" + wheel +
                '}';
    }

    public void start(){
        System.out.println("Go GO");
    }


}
// 2) Створити клас Кермо, Колесо, Кузов - описати дані класи(getters, setters, toString).
// Всі поля повинні бути приватними. Додати методи які б виконували певні функції з полями,
// тобто збільшували розмір колеса у декілька разів, чи змінювали діаметр керма і т.д..
// Створити клас Машина, який матиме деякі свої поля та об’єкти класу Кермо, Кузов,Колесо -
// як поля класу. Додати методи, які би змінювали стан полів класу , для виконання певних функцій,
// описати даний клас(getters, setters, toString). Всі поля повинні бути параметрами в конструкторі.
// В мейн методі , створити об`єкт Машина, запустити всі його методи.
