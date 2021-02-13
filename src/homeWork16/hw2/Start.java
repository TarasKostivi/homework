package homeWork16.hw2;

import homeWork14.Account;
import homeWork14.Person;

import java.util.*;

public class Start {
    public static void main(String[] args) {

        MyEntry<Integer, String> myEntry = new MyEntry<>(14, "Text1");
        MyEntry<Integer, String> myEntry2 = new MyEntry<>(41, "Text2");
        MyEntry<Integer, String> myEntry3 = new MyEntry<>(51, "Text3");

        Map<String, MyEntry> map = new HashMap<>();
        map.put("1", myEntry);
        map.put("2", myEntry2);
        map.put("3", myEntry3);

        map.remove("1");
        map.remove("2", myEntry2);

        System.out.println(map);
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (Map.Entry<String, MyEntry> print : map.entrySet()){
            System.out.println(print);
        }
    }

}
