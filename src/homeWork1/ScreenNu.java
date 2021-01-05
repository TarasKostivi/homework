package homeWork1;
import java.util.Scanner;

public class ScreenNu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number m");
        double m = scanner.nextDouble();
        System.out.println("Enter number n");
        double n = scanner.nextDouble();

        int d = 10;
        double b = Math.abs(d - n);
        double c = Math.abs(d - m);

        if (b == c) {
            System.out.println("Number " + n + " and " + m + " equal " + d);
        } else if (b < c) {
            System.out.println("Number " + n + " shines to " + d);
        }
    }
}
//Створити програму, що виводить на екран найближче до 10 з двох чисел, записаних
// в змінні m і n. Користувач вводить два числа m та n , програма виводить число,
// яке є ближче до 10. Наприклад, введено числа 8.5 і 11.1. Відповідь: 11.1
