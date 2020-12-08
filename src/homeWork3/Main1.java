package homeWork3;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put money in the Bank ::");
        int m = scanner.nextInt();
        double n = 0.07;
        int r = 7;
        for (int i = 0; i < r; i++) {
            System.out.println(i);
            n += n * m / 100;
        }
        System.out.print(n);
    }
}
// Hometask // В Банк поклали m - гривень під n-% відсотків річних. Яким буде вклад
// за К - років. Користувач вводить : m - суму грошей, n - процентна ставка та  R - кількість років.