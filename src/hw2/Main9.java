package hw2;

public class Main9 {
    public static void main(String[] args) {
        int n = 7;
        int num = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");
        }
    }
}

//Составьте "Треугольник Флойда", который выглядит как набор чисел,
// которые увеличиваются на единицу. Например,
// треугольник с высотой шесть строк выглядит следующим образом.