package homeWork1;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Створємо зміну а і передаємо в switch  стіоріюємо case номер і його дії в середені
        int a = scanner.nextInt();
        switch (a){
            case 29: {
                System.out.println("Monday");
                System.out.println("1. Go to shopping ");
                System.out.println("2. Go to walk");
                break;
            }
            case 30: {
                System.out.println("Tuesday");
                System.out.println("1. Go to shopping ");
                System.out.println("2. Go to Learn English");
                System.out.println("3. Go to relax ");
                System.out.println("4. Go to walk with friends");
                break;
            }
            case  1:{
                System.out.println("Wednesday");
                System.out.println("1. Go to Learn Java ");
                System.out.println("2. Go to walk with my dog");
                break;
            }
            case 2:{
                System.out.println("Thursday");
                System.out.println("1. go to shop lviv");
                System.out.println("2. Go to walk lviv");
                break;
            }
            case 3:{
                System.out.println("Friday");
                System.out.println("1. Go to drive my car ");
                System.out.println("2. Go to walk");
                break;
            }
            case 4:{
                System.out.println("Saturday");
                System.out.println("1. Go to swimming ");
                System.out.println("2. Go to walk");
                break;
            }
            case 5:{
                System.out.println("Sunday");
                System.out.println("1. Go to shopping ");
                System.out.println("2. Go to walk");
                break;
            }
            default: {
                System.out.println("Incorrect day");
                break;
            }
        }
    }
}

//2. Створити стрічкову змінну яка зберігатиме день тижня.
// Ввести значення з клавіатури. Використовуючи конструкцію
// switch скласти розклад на тиждень. В залежності від дня
// тижня у користувача на екрані відображається,
// те, що заплановано на цей день.