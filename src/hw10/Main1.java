package hw10;

import java.util.Locale;

public class Main1 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        str.charAt(str.length()-1);
        System.out.println(str.charAt(str.length()-1));

        str.endsWith("!!!");
        System.out.println(str.endsWith("!!!"));

        str.startsWith("I like");
        System.out.println(str.startsWith("I like"));

        str.contains("Java");
        System.out.println(str.contains("Java"));

        str.indexOf("Java");
        System.out.println(str.indexOf("Java"));

        str.replace('a', 'o');
        System.out.println(str.replace('a', 'o'));

        str.toUpperCase(Locale.ROOT);
        System.out.println(str.toUpperCase(Locale.ROOT));

        str.toLowerCase(Locale.ROOT);
        System.out.println(str.toLowerCase(Locale.ROOT));

        str.substring(0, 6);
        System.out.println(str.substring(0,6));

    }
}
