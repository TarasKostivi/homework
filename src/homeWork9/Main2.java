package homeWork9;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.println("Type two nimbers");
        try{
            a = scanner.nextInt();
            b = scanner.nextInt();
            int z = a + b;
            System.out.print("sum::"+z);
        }catch (Exception e){
            System.out.println("Error type number!");
        }
    }
}
//2) Створити програму, яка буде обчислювати і виводити на екран суму двох цілих чисел, введених користувачем.
//Якщо користувач некоректно введе хоча б одне з чисел, то повідомляти про помилку.