package homeWork5.Car;

public class Car {
    private String model;
    private int year;
    private String color;

    public Car(){

    }

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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