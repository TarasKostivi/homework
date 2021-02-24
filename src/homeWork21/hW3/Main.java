package homeWork21.hW3;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Main {
    public static void main(String[] args) {
        INum maxValue = (a, b, c) ->{
           if (a > b && a > c){
               return a;
           }else if (b > a && b > c){
               return b;
           } else if(c > a && c > b){
                return c;
            }
           return a + b +c;
        };
        INum midValue = (a, b, c) ->{
            return a + b + c / 2;
        };

        INum sumValue = (a, b, c) ->{
            return a + b + c;
        };
        System.out.println(maxValue.num(25,22,50));
        System.out.println(midValue.num(2,22,33));
        System.out.println("Sum: " + sumValue.num(4, 7, 8));
    }

    @FunctionalInterface
    public interface INum{
        public int num(int a, int b, int c);
    }

}
