package homeWork8.Season;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити,
    // щоб регістр букв був не важливим ).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter enother to Month");
        String something = scanner.next();
        Month someMonth = Month.fromString(something);
        System.out.println(someMonth);

        //Вивести на екран чи введений з консолі місяць має парну кількість днів.
        if (someMonth.getDays() % 2 == 1){
            System.out.println("Парне");
        }else {
            System.out.println("Непарне");
        }

        //Вивести всі місяці з такою ж порою року.
        for (Month month : Month.values()){
            System.out.println(month.name() + " - " +  month.getSeason());
        }

        //Вивести всі місяці які мають таку саму кількість днів.
        //Вивести на екран всі місяці які мають меншу кількість днів.
        //Вивести на екран всі місяці які мають більшу кількість днів.
        System.out.println(" Less day");
        for (Month month : Month.values()) {
            if (month.getDays() == 30) {
                System.out.print(month + " ");
            }
        }
        System.out.println(" Less day");
        for (Month month : Month.values()) {
            if (month.getDays() > 29) {
                System.out.print(month + " ");
            }
        }
        System.out.println(" Less day");
        for (Month month : Month.values()) {
            if (month.getDays() < 31) {
                System.out.print(month + " ");
            }
        }



        //Вивести на екран наступну пору року.
        //Вивести на екран попередню пору року.
        System.out.print("Наступна пора року - " + Month.DECEMBER.getSeason());
        System.out.println("Попередня пора року - " + Month.SEPTEMBER.getSeason());

        //Вивести на екран всі місяці які мають парну кількість днів.
        //Вивести на екран всі місяці які мають непарну кількість днів.
        for (Month month : Month.values()){
            if (month.getDays() % 2 == 1){
                System.out.println(month.name() + " - Парне");
            }else {
                System.out.println(month.name() + " - Непарне");
            }
        }
    }
}





