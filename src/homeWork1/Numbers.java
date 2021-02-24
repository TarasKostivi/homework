package homeWork1;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println("Pair");
        }else {
            System.out.println("odd");
        }
    }
}
// 4. Створити програму, що перевіряє і повідомляє на екран, чи є ціле число записане в змінну n,
// парним або непарним. Користувач вводить число - n , програма виводить число є парним чи
// непарним. Підказка - можна шукати остачу від ділення. Наприклад 10 % 3 = 1.