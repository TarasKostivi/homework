package hw3;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[][] array = new int [5][7];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = ((int)(Math.random() - 2) + 75 );
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
// Створити двовимірний масив, який буде мати 5 рядків і 7 стовпців
// і заповнити його рандомними (Math.random()) цифрами з проміжку [-2, 75]