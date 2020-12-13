package homeWork3;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the letters");
        String string1 = scanner.nextLine();
        System.out.println("Enter the letters");
        String string2 = scanner.nextLine();
        String[][] matrix = new String[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(string1.toUpperCase());
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(string2.toUpperCase());
            }
        }
    }
}
