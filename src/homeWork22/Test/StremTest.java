package homeWork22.Test;

import java.util.*;
import java.util.stream.Collectors;

public class StremTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Best", "is", "Apple", "massage", "This"));
        list.stream().filter(element -> element.equals("is"))
                .forEach(System.out::println);// Фільтрує записи які дорівнюють is equals
        list.stream()
                .filter(element -> element.length() > 4)
                .forEach(System.out::println); // Фільтрує запис слів які більше чим 4 букви

        System.out.println("\nПропускає N  перших елементів");
        list.stream()
                .skip(list.size() - 2)
                .forEach(System.out::println);

        System.out.println("\nПовертає стрім без дублікатів distinct()");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("\nПовертає кожен елемент стріма map()");
        list.stream()
                .map(element -> element + ": map")
                .forEach(System.out::println);
        list.stream()
                .map(element -> element.toUpperCase(Locale.ROOT))
                .forEach(System.out::println); // Всі елементи в верхньому регістрі toUpperCase()

        System.out.println("\nПовертає вибіркову кількітсть елементів");
        list.stream()
                .limit(4)
                .forEach(System.out::println);

        System.out.println("\nSort by ///");
        list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("\nАналог map, але повертає числовий" +
                " стрім (тобто стрім з числових примітивів)");
        List<String> stringList = new ArrayList<>(Arrays.asList("123", "456", "789", "258"));
        stringList.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
        stringList.stream().mapToInt(element -> Integer.parseInt(element)).forEach(System.out::println);
    }
}
