package homeWork12.hW3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alina", 21, "White");
        Person person2 = new Person("Ira", 22, "Black");
        Person person3 = new Person("Diana", 23, "Blue");
        Person person4 = new Person("Nada", 22, "Green");

        List<Person> list = new LinkedList<>();
        list.add(person);
        list.add(person2);
        list.add(person3);
        list.add(person4);

        Collections.sort(list);

        for (Person sortHair: list) {
            System.out.println(sortHair);
        }

    }
}
