package homeWork2;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 0");
        while (scanner.nextInt() != 0){
            System.out.println("Спробуйте ще раз");
        }
        System.out.println("Чудово");
    }
}
// 4. Просити користувача вводити числа доти, доки він не введе нуль.