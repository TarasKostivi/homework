package homeWork3;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[][] array = new int [5][7];
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < i; i++){
                array[i][j] = ((int)(Math.random() -10) );
                System.out.println(Arrays.toString(array[i]));
            }
        }
    }
}
// Створити двовимірний масив, який буде мати 5 рядків і 7 стовпців
// і заповнити його рандомними (Math.random()) цифрами з проміжку [-2, 75]