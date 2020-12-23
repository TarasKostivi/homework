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
