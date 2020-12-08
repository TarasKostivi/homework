package homeWork2;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        int max = getMax(array);
        System.out.println("Max value is: " + max);

        int min = getMin(array);
        System.out.println("Min value is: " + min);
    }
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) { if (inputArray[i] > maxValue) {
            maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
            minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
//Створіть масив, наповніть його даними з клавіатури,
// знайдіть найбільше та найменше значення масиву.