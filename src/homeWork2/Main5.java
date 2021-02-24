package homeWork2;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("8 * 9 = ");
        while (scanner.nextInt() != 72){
            System.out.println("Спробуйте ще раз");
        }
        System.out.println("Чудово");
    }
}
// 5. Задати приклад користувачу(наприклад 8*9 = ) і попросити користувача ввести відповідь,
// він буде вводити до того, доки не введе правильну відповідь.