package homeWork3;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 9 characters");

        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print("Enter element [" + i +"][" + j + "] :");
                matrix[i][j] = scanner.nextInt(); 
            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
//    • String без пробілів, букви та цифри, дана стрічка буде конвертована в матрицю
//    N*N тому кількість символів має бути така, щоб з неї можна було добути корінь :
//    1, 4, 9, 16, 25, 36 і так далі. Якщо наприклад користувач ввів 9 символів то матриця буде розміром 3*3.
//    Якщо користувач ввів число з якого не можна добути корінь, запропонуйте йому вводити доти, доки він не введе
//    добру кількість символів.