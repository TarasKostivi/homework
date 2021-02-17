package homeWork1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Перший і другий корінь = 0.
        int secondRoot=0, firstRoot=0;
        // Створюємо сканер.
        Scanner scn = new Scanner(System.in);
        // Просимо користувача вводити число a,b,c
        System.out.println("Enter number 'a' ::");
        int a = scn.nextInt();
        System.out.println("Enter number 'b' ::");
        int b = scn.nextInt();
        System.out.println("Enter number 'c' ::");
        int c = scn.nextInt();
        // Виконуємо формулу a * (b * b) + (a * b + c) і округляєм числа через Math.round
        int determinant = a * (b * b) + (a * b + c);
        int sqrt = Math.round (determinant);
        // Якщо determinant > 0 виводимо 1 і 2 корінь
        // Якщ неправильно візмемо else if determinant == 0
        if (determinant > 0){
            firstRoot = (-b + sqrt)/(2*a);
            secondRoot = (-b - sqrt)/(2*a);
            System.out.println("Roots are ::" + firstRoot);
            System.out.println("Roots are ::" + secondRoot);
        }else if (determinant == 0){
            System.out.println("Root is : : " + (-b + sqrt)/(2*a));
        }else {
            System.out.println("there are no solutions"); // розв’язків немає
        }
    }
}

//1. Реалізувати алгоритм написаний у попередньому ДЗ через програму - пошук
// коренів квадратного рівняння a*x^2 + b*x + c = 0. Користувач вводить (a,b,c)
// і отримує: два розв’язки, або один розв’язок, або повідомлення про те, що
// розв’язків немає.