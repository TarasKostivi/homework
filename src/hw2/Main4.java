package hw2;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 0");

        int sum = 0;
        while (true){
            int wrongNumber = scanner.nextInt();
            if (wrongNumber == 0) break;
            sum += wrongNumber;
        }
        System.out.println("Sum is " + sum);
    }

}
//Просити користувача вводити числа доти, доки він не введе нуль .