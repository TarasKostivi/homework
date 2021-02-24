package homeWork9;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args)throws IllegalAccessException, MyException  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Second first number");
        int b = sc.nextInt();
        int c = addition(a,b);
        int z = minus(a,b);
        int p = multiplication(a,b);
        int l = division(a,b);

        System.out.println("Addition of two numbers is :"+c);
        System.out.println("Minus of two numbers is :"+z);
        System.out.println("Multiplication of two numbers is :"+p);
        System.out.println("Division of two numbers is :"+l);

            if (a<0 && b < 0){
                throw new IllegalArgumentException();
            }else if (a == 0 && b==0){
                throw new IllegalAccessException();
            }else if (a==0 && b!=0 || a!= 0 && b==0){
                throw new ArithmeticException();
            } else if(a>0 && b>0){
                throw new MyException("Some massage");
            }

    }
    static int addition(int x, int y){
        return x+y;
    }
    static int minus(int x, int y){
        return x-y;
    }
    static int multiplication(int x, int y){
        return x*y;
    }
    static int division(int x, int y){
        return x/y;
    }
}
