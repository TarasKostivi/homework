package homeWork9.hW1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User user = new User("Ovan", 17);
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();


        try{
            user.validate();
        }catch (NotAnIntegerException e){
            System.out.println(e.getMessage());
        }


    }
}
