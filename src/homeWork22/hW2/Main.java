package homeWork22.hW2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/*
Hometask
Дана колекція клас People (з полями name - ім'я, age - вік, sex - стать)
 */
public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Denis", 27, "Man"));
        people.add(new Person("Anton", 18, "Man"));
        people.add(new Person("Trish", 19, "Women"));
        people.add(new Person("Anna", 100, "Women"));
        people.add(new Person("Taras", 22, "Man"));
        people.add(new Person("Pavel", 25, "Man"));
        people.add(new Person("Alina", 61, "Women"));

        //Вибрати чоловіків-військовозобов'язаних (від 18 до 27 років)
        System.out.println("Призовний вік від 18 до 27");
        List<Person> personListArmMan = people.stream()
                .filter(person -> person.getSex().equals("Man"))
                .filter(person -> person.getAge() >= 18)
                .filter(person -> person.getAge() < 27 )
                .collect(Collectors.toList());
        personListArmMan.forEach(System.out::println);

        //Знайти середній вік серед чоловіків
        System.out.println("\nСередній вік чоловіків");
        double averageMan = people.stream().filter(person -> person.getSex().equals("Man"))
                .mapToInt(Person::getAge).average().getAsDouble();
        System.out.println("Average " + averageMan);

        // Знайти кількість потенційно працездатних
        // людей у вибірці (тобто від 18 років і з огляду
        // на що жінки виходять в 55 років, а чоловік в 60)
        List<Person> personListWork = people.stream()
                .filter(person -> person.getAge() >=18)
                .filter(person -> person.getSex().equals("Man"))
                .filter(person -> person.getAge() > 55)
                .filter(person -> person.getSex().equals("Women"))
                .filter(person -> person.getAge() < 60)
                .collect(Collectors.toList());
        personListWork.forEach(System.out::println);

        //Відсортувати колекцію людей за ім'ям в зворотному алфавітному порядку
        System.out.println("\nВідсортувано колекцію людей за ім'ям " +
                "в зворотному алфавітному порядку");
        List<Person> listSortName = people.stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .collect(Collectors.toList());
        listSortName.forEach(System.out::println);

        //Відсортувати колекцію людей спочатку за ім’ям, а потім за віком
        System.out.println("\nВідсортувати колекцію людей спочатку за ім’ям, а потім за віком");
        List<Person> listSortCollection = people.stream()
                .sorted(Comparator.comparing(Person::getName))
                //.sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());
        listSortCollection.forEach(System.out::println);

        //а потім за віком 2.0
        System.out.println("\nза віком");
        List<Person> listSortNameC = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());
        listSortNameC.forEach(System.out::println);

        //Знайти найстаршу людину List<Person> findOldPerson =
        System.out.println("\nНайстарша людина");
        people.stream().reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2)
                .ifPresent(System.out::println);

        //Знайти наймолодшу людину
        System.out.println("\nНаймолодша людина");
        people.stream().reduce((p1, p2) -> p1.getAge() < p2.getAge() ? p1 : p2)
                .ifPresent(System.out::println);

        //Вивести скільки є чоловіків
        System.out.println("\nКількість чоловіків");
        Long countMan = people.stream()
                .filter(person -> person.getSex().contains("Man"))
                .count();
        System.out.println(countMan);

        //Вивести скільки є жінок
        System.out.println("Кількість жінок");
        Long countWomen = people.stream()
                .filter(person -> person.getSex().contains("Women"))
                .count();
        System.out.println(countWomen);

        //Вивеcти всіх жінок в яких ім’я починається на “A”
        System.out.println("\nЖінки які починаються на А");
        List<Person> womenAStars = people.stream().filter(person -> person.getSex().equals("Women"))
                .filter(person -> person.getName().contains("A")).collect(Collectors.toList());
        womenAStars.forEach(System.out::println);

    }
}
