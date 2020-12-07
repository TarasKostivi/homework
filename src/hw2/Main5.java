package hw2;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("8 * 9 = ");

        while (true){
            int totalSum = scanner.nextInt();
            if (totalSum == 72) break;
        }
    }
}
// Задати приклад користувачу(наприклад 8*9 = )
// і попросити користувача ввести відповідь ,
// він буде вводити до того, доки не введе
// правильну відповідь.