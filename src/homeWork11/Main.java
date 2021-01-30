package homeWork11;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Break:");
        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        String prefix = "s";

        while (!list.contains("Break") ){
            list.add(scanner.nextLine());
            System.out.println(list);
        }
        System.out.println("всіх слова, які він ввів!");
        for (String lis: list) {
            System.out.println(lis);
        }
        System.out.println("які починаються на “s”");
        for (String s : list) {
            if(s.startsWith(prefix)){
                result.add(s);
            }
            System.out.println(result);
        }

        System.out.println("кількість букв більше ніж 5!");
        for (String length : list) {
            if (length.length() >= 5){
                System.out.println(length);
            }
        }

        System.out.println("перевірити розмір ліста. " +
                "Якщо більше 5, то видалити всі наступні елеменити ");
        while (list.size() > 5){
            list.remove(list.size() -1);
        }
        System.out.println(list);

        if (list.size() <= 0){
            throw new Exception("0 element");
        }
    }
}
