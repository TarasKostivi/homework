package homeWork9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("pair");
        }else {
            throw new Exception("No pair");
        }
    }
}

//1) Створити програму, яка буде повідомляти, чи є ціле число, введене користувачем, парним або непарним. Якщо
//користувач введе не ціле число, то повідомляти йому про помилку.