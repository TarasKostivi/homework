package homeWork3;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scArray = new Scanner(System.in);

        System.out.println("Enter the required size of the array ::");
        int[] myArray = new int [10];

        for (int i = 0; i <= 9; i++) {
            myArray[i] = scArray.nextInt();
        }
        System.out.println("Contents of the array are: " + Arrays.toString(myArray));
        System.out.println("Original Array printed in reverse order:");

        for (int i = myArray.length -1; i >= 0 ; i--) {
            System.out.print(myArray[i] + " ");
        }
    }
}

// Запропонувати користувачу вводити числа доти, доки він не введе “0”.
// Після того, як користувач вводить “0” вивести на екран кількість чисел та суму чисел.
// Вивести суму всіх цілих чисел з проміжку, який введе користувач [a, b].
// Користувач вводить 10 чисел , в кінці програма рахує скільки додатних,
// від’ємних та нулів введено і виводить на екран