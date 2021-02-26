package homeWork22.test2;

import homeWork22.Test.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
          Arrays.asList("this is test string",
                  "for my task",
                  "I love java",
                  "la lallla llas"));

        //flatMap()
        //flatMapToInt() ,
        //flatMapToDouble(),
        //flatMapToLong()
        //Схоже на map, але може створювати з одного елемента кілька
        String[] words = list.stream().flatMap(str -> Arrays.stream(str.split("")))
                .toArray(String[]::new);

        for (String word : words) {
            System.out.println(word);
        }
        //findFirst()
        //Повертає перший елемент з стріму (повертає Optional)

        List<String> list2 = new ArrayList<>(
                Arrays.asList("Apple", "Banana", "Orange", "Lemon", "Lime"));

        String str = list2.stream().filter(fruit -> fruit.startsWith("L"))
                .findFirst()
                .orElse("No fruit");

        //findAny()
        //Повертає будь-який відповідний елемент з стріму (повертає Optional)
        String str2 = list2.stream().filter(fruit -> fruit.length()==5)
                .findAny()
                .orElse("No fruit with length 5");

        System.out.println(str);
        System.out.println(str2);

        //collect()
        //Представлення результатів у вигляді колекцій та інших структур даних
        List<String> collection = list2.stream()
                .filter((s) -> s.contains("a"))
                .collect(Collectors.toList());
        collection.forEach(System.out::println);

        //Count
        // Повертає кількість елементів у Стрімі
        long count = list2.stream()
                .filter((s) -> s.contains("a"))
                .count();

        System.out.println(count);

        //anyMatch()
        //Повертає true, якщо умова виконується хоча б для одного елемента
        //noneMatch()
        //Повертає true, якщо умова не виконується ні для одного елемента
        //allMatch()
        //Повертає true, якщо умова виконується для всіх елементі
        boolean anyMatch = list2.stream().anyMatch(s -> s.contains("a"));
        boolean noneMatch = list2.stream().noneMatch(s -> s.contains("a"));
        boolean allMatch = list2.stream().allMatch(s -> s.contains("a"));

        System.out.println("Any match " + anyMatch);
        System.out.println("None match " + noneMatch);
        System.out.println("All match " + allMatch);

        //min()
        //Повертає мінімальний елемент, як умову використовує компаратор
        //max()
        //Повертає максимальний елемент, як умову використовує компаратор
        String min = list2.stream()
                .min(String::compareTo).get();
        String max = list2.stream()
                .max(String::compareTo).get();
        System.out.println("Min " + min);
        System.out.println("Max " + max);

        //forEach()
        //Застосовує функцію до кожного об'єкту стріму, порядок при
        // паралельному виконанні не гарантовано
        //forEachOrdered()
        //Застосовує функцію до кожного об'єкту стріму, збереження
        // порядку елементів гарантує
        list2.stream().forEachOrdered(System.out::println);
        list2.stream().forEach(System.out::println);

        //toArray()
        //Повертає масив значень стріму.
        //reduce()
        //Дозволяє виконувати агрегатні функції на всій колекцією і повертати один результат.
        String[] array = list2.stream()
                .map(String::toUpperCase)
                .toArray(String[]::new);
        System.out.println(array[1]);

        //sum()
        //Повертає суму всіх чисел.
        //average()
        //Повертає середнє арифметичне всіх чисел
        String result = list2.stream()
                .reduce((a1, a2) -> a1 + a2)
                .orElse(null);
        System.out.println(result);

        List<String> numList = new ArrayList<>(Arrays.asList("1", "54", "-4", "13"));

        int sum = numList.stream()
                .mapToInt(Integer::parseInt).sum();
        double average = numList.stream()
                .mapToInt(Integer::parseInt).average().getAsDouble();

        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);

        //mapToObj()
        //Перетворює числовий стрім назад в об'єктний
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 3, 23, 56));
        List<Person> people = integerList.stream()
                .mapToInt(Integer::new)
                .mapToObj(age -> new Person("God", age))
                .collect(Collectors.toList());
        people.forEach(System.out::println);



    }
}
