package homeWork19.hW2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = reader.nextInt();
        Thread threadFibonaci = new Thread(new ThreadFibonaci(n));
        Thread myTheard = new MyTheard();

        threadFibonaci.start();
        myTheard.start();
    }
}
