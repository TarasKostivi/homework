package homeWork2;

import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
        int[] array = {1, 2, -20, -40, -67, 57, 67, 45, 46, 0, 0};
        int[] negative = new int[3];
        int[] positive = new int[6];
        int n = 0;
        int p = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] < 0){
                negative[n] = array[i];
                n++;
            }else if (array[i] > 0){
                positive[p] = array[i];
                p++;
            }
        }
        System.out.println("Negative array :" + Arrays.toString(negative));
        System.out.println("Positive array :" + Arrays.toString(positive));
    }
}
// Створіть масив, наповніть його даними з клавіатури (додатні і від'ємні числа, нулі).
// Створений масив розділіть на два окремі масиви - один з додатніми числами і другий
// з від'ємними. Нулі не попадають в жоден з масивів. Нові масиви вивести на екран.