package homeWork22.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Start {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Igor", 10));
        personList.add(new Person("Taras", 20));
        personList.add(new Person("Sergiy", 30));
        personList.add(new Person("Oleksandr", 40));

        // Збільшувати всім вік на 5 років
        personList.stream().peek(person -> person.setAge(person.getAge() + 5)).forEach(System.out::println);

        System.out.println("\nЗбільшує регістер");
        personList.stream().peek(person -> person.setName(person.getName().toUpperCase(Locale.ROOT))).forEach(System.out::println);

        System.out.println("\nКомпаратор");
        personList.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).forEach(System.out::println);

//        String min = personList.stream().min(String::compareTo).get();
//        String max = personList.stream().max(String::compareTo).get();
//
//        System.out.println("Min " + min);
//        System.out.println("Max " + max); Як порівняти з допомогою комператора імя

    }
}
