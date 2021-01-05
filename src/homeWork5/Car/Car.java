package homeWork5.Car;

public class Car {
    private Helm helm;
    private CarBody carBody;
    private Wheel wheel;

    public Car(Helm helm, CarBody carBody, Wheel wheel) {
        this.helm = helm;
        this.carBody = carBody;
        this.wheel = wheel;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "helm=" + helm +
                ", carBody=" + carBody +
                ", wheel=" + wheel +
                '}';
    }
}
// 2) Створити клас Кермо, Колесо, Кузов - описати дані класи(getters, setters, toString).
// Всі поля повинні бути приватними. Додати методи які б виконували певні функції з полями,
// тобто збільшували розмір колеса у декілька разів, чи змінювали діаметр керма і т.д..
// Створити клас Машина, який матиме деякі свої поля та об’єкти класу Кермо, Кузов,Колесо -
// як поля класу. Додати методи, які би змінювали стан полів класу , для виконання певних функцій,
// описати даний клас(getters, setters, toString). Всі поля повинні бути параметрами в конструкторі.
// В мейн методі , створити об`єкт Машина, запустити всі його методи.
