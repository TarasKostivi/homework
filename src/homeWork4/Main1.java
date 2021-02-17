package homeWork4;

public class Main1 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(10, 2);

        rectangle1.getPerimeter();
        rectangle1.getArea();
        rectangle1.setLength(20);
        rectangle1.setWight(4);
        rectangle1.print();

        rectangle2.getPerimeter();
        rectangle2.getArea();
        rectangle2.getLength();
        rectangle2.getWight();
        rectangle2.print();
    }
}

//Описати клас Rectangle , в якому буде описано поля : довжина, ширина.
//Описати дані поля в конструкторі. Створити конструктор з параметрами і без
//параметрів. В конструкторі без параметрів описати свої дані. Тобто створюючи
//об’єкт, за вибору даного конструктору, ви отримаєте прямокутник даного розміру.
//Написати методи, які будуть розраховувати площу та периметр. В Main класі
//продемонструвати створення об’єктів використовуючи два конструктори. Вивести на
//консоль площу і периметр прямокутника.
//Вивід на консолі повинен мати наступний вигляд: «Площа прямокутника = ... »,
//«Периметр прямокутника = ... » .