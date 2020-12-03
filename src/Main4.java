import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 0");
        int wrongNumber = scanner.nextInt();


        for (int i = 0; i < wrongNumber; i++) {
            System.out.println("You entered an incorrect number");
        }
    }

}
//Просити користувача вводити числа доти, доки він не введе нуль.