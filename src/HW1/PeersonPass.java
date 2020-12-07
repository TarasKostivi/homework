package HW1;

import java.util.Scanner;

public class PeersonPass {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Password ::");
        String passwordUser = scanner.next();
        if (passwordUser.equals("pass123")){
            System.out.println("You are authorized");
        }else if(passwordUser.equals("Admin")){
            System.out.println("you are authorized as an administrator");
        }else {
            System.out.println("wrong password");
        }
    }
}
//3. Користувача просять ввести пароль. Нехай правильним паролем буде pass123. Є 3 варіанти розвитку подій:
//- користувач вводить правильний пароль, виводимо, що він авторизований
//- користувач вводить admin , виводимо, що він авторизований як адмін
//- користувач вводить щось інше - виводимо - неправильний пароль

