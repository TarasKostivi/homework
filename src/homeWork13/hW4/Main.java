package homeWork13.hW4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Commodity> commodities = new ArrayList<>();
        commodities.add(new Commodity("Coffe", 20, 2, 3, 2));
        commodities.add(new Commodity("Tea", 34,6, 5, 1));
        commodities.add(new Commodity("Paper", 2, 8, 2, 3));
        commodities.add(new Commodity("FlashDisc", 500, 5, 3, 2));
        commodities.add(new Commodity("Alcol", 500, 2, 1, 0));

        commodities.remove(0);
        commodities.set(0, new Commodity("Zefir", 20, 7, 8, 1));

        Collections.sort(commodities, new ComparatorByName());
//        Collections.sort(commodities, new ComparatorByLength());
//        Collections.sort(commodities, new ComparatorByWight());
//        Collections.sort(commodities, new ComparatorByVaga());
        printList(commodities);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index items: ");
        Commodity someCommodity = commodities.get(scanner.nextInt());
        System.out.print(someCommodity);
        System.exit(0);
    }
    private static void printList(List<?> list){
        for (Object elem : list) {
            System.out.println(elem + " ");
        }
        System.out.println();
    }
}
