package homeWork13.hW1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Shoping item1 = new Shoping("Coffe", 20);
        Shoping item2  = new Shoping("Water", 40);
        Shoping item3  = new Shoping("Tea", 10);

        TreeSet<Shoping> shopings = new TreeSet<>();
        shopings.add(item1);
        shopings.add(item2);
        shopings.add(item3);

        for (Shoping strSort: shopings) {
            System.out.println(strSort);
        }

        LinkedHashSet<Shoping> shopings1 = new LinkedHashSet<>();
        shopings1.add(item1);
        shopings1.add(item2);
        shopings1.add(item3);

        for (Shoping strSort2: shopings1) {
            System.out.println(strSort2);
        }

        HashSet<Shoping> shopings2 = new HashSet<>();
        shopings2.add(item1);
        shopings2.add(item2);
        shopings2.add(item3);

        for (Shoping strSort3: shopings2) {
            System.out.println(strSort3);
        }
    }
}
