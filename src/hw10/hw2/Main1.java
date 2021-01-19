package hw10.hw2;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter world of 5 letters");
        String w = scanner.nextLine();
        String s = "Пилип";

        if (s.equalsIgnoreCase(w)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        if (w.length() > 5){
           throw new Exception("Ви вели більше чим 5 букв");
        }
    }
}
