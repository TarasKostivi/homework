package homeWork22.test2;

import homeWork22.Test.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
          Arrays.asList("this is test string", "for my task", "I love java", " la lallla llas"));

        String[] words = list.stream().flatMap(str -> Arrays.stream(str.split("")))
                .toArray(String[]::new);

        for (String word : words) {
            System.out.println(word);
        }

        List<String> list2 = new ArrayList<>(
                Arrays.asList("Apple", "Banana", "Orange", "Lemon", "Lime"));

        String str = list2.stream().filter(fruit -> fruit.startsWith("L"))
                .findFirst()
                .orElse("No fruit");
        String str2 = list2.stream().filter(fruit -> fruit.length()==5)
                .findAny()
                .orElse("No fruit with length 5");

        System.out.println(str);
        System.out.println(str2);

        List<String> collection = list2.stream().filter((s) -> s.contains("a"))
                .collect(Collectors.toList());

        collection.forEach(System.out::println);

        long count = list2.stream().filter((s) -> s.contains("a"))
                .count();

        System.out.println(count);

        boolean anyMatch = list2.stream().anyMatch(s -> s.contains("a"));
        boolean noneMatch = list2.stream().noneMatch(s -> s.contains("a"));
        boolean allMatch = list2.stream().allMatch(s -> s.contains("a"));

        System.out.println("Any match " + anyMatch);
        System.out.println("None match " + noneMatch);
        System.out.println("All match " + allMatch);

        String min = list2.stream().min(String::compareTo).get();
        String max = list2.stream().max(String::compareTo).get();

        System.out.println("Min " + min);
        System.out.println("Max " + max);

        list2.stream().forEachOrdered(System.out::println);
        list2.stream().forEach(System.out::println);

        String[] array = list2.stream().map(String::toUpperCase)
                .toArray(String[]::new);

        System.out.println(array[1]);


        String result = list2.stream().reduce((a1, a2) -> a1 + a2).orElse(null);
        System.out.println(result);

        List<String> numList = new ArrayList<>(Arrays.asList("1", "54", "-4", "13"));

        int sum = numList.stream().mapToInt(Integer::parseInt).sum();
        double average = numList.stream().mapToInt(Integer::parseInt).average().getAsDouble();

        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 3, 23, 56));

        List<Person> people = integerList.stream().mapToInt(Integer::new)
                .mapToObj(age -> new Person("God", age)).collect(Collectors.toList());

        people.forEach(System.out::println);

    }
}
