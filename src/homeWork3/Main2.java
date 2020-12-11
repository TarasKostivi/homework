package homeWork3;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Enter the required size of the array ::");
        Scanner scArray = new Scanner(System.in);
        int arrayLength = scArray.nextInt();
        int[] myArray;
        myArray = new int [arrayLength];

        System.out.println("Enter the elements of the array one by one");

        for (int i = 0; i < arrayLength; i++) {
            myArray[i] = scArray.nextInt();
        }
        System.out.println("Contents of the array are: " + Arrays.toString(myArray));
        System.out.println("Original Array printed in reverse order:");

        for (int i = myArray.length -1; i >= 0 ; i--) {
            System.out.print(myArray[i] + " ");
        }
    }
}
// Hometask// Користувач задає елементи масиву певного розміру
// (розмір масиву вибирає програміст). Ваше завдання вивести масив,
// який ввів користувач, а потім вивести масив у зворотньому порядку.

