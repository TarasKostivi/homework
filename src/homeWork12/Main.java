package homeWork12;
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
        System.out.println("Your worlds");
        for (String lis: list) {
            System.out.println(lis);
        }
        System.out.println("Worlds start “s”");
        for (String s : list) {
            if(s.startsWith(prefix)){
                result.add(s);
            }
            System.out.println(result);
        }

        System.out.println("less 5!");
        for (String length : list) {
            if (length.length() >= 5){
                System.out.println(length);
            }
        }

        System.out.println("check list size. " +
                "if more 5, delete next element ");
        while (list.size() > 5){
            list.remove(list.size() -1);
        }
        System.out.println(list);

        if (list.size() <= 0){
            throw new Exception("0 element");
        }
    }
}
