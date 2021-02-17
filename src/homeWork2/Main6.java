package homeWork2;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        System.out.println("Enter array size");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= 9; i++)
        {
            array[i] = scanner.nextInt();
            if (array[i] < min)
            {
              min = array[i];
            }
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        System.out.println("Max is " + max);
        System.out.println("Min is "  + min);
    }
}
// 6. Створіть масив, наповніть його даними з клавіатури,
// знайдіть найбільше та найменше значення масиву.