package homeWork22.hW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three", "Four", "Five", "One"));

        //Повернути кількість входжень об'єкта «One»
        System.out.println("Повертає кількість входжень об'єкта «One»");
        long countOne = list.stream()
                .filter(s -> s.equals("One"))
                .count();
        System.out.println(countOne);

        //Повернути перший елемент колекції або 0, якщо колекція порожня
        System.out.println("Повертає перший елемент колекції або 0");
        String firstElement = list.stream()
                .findFirst()
                .orElse("0");
        System.out.println(firstElement);

        // Повернути останній елемент колекції або «empty»,
        // якщо колекція порожня
        System.out.println("Повертає останній елемент колекції або «empty»");
        String lastElement = list.stream()
                .skip(list.size() -1)
                .findFirst()
                .orElse("empty");
        System.out.println(lastElement);

        //Знайти елемент в колекції рівний «Three» або кинути помилку
        System.out.println("Знаходить елемент в колекції рівний «Three» або кинути помилку");
        try {
            String three = list.stream().filter(s -> s.equals("Three")).findAny()
                    .orElseThrow(() -> new Exception("No word Three"));
            System.out.println(three);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Повернути третій елемент колекції по порядку
        System.out.println("Повертає третій елемент колекції по порядку");
        String third = list.stream().skip(2).limit(1).findFirst().orElse("3");
        System.out.println(third);

        //Повернути два елементи починаючи з другого
        System.out.println("Повертає два елементи починаючи з другого");
        list.stream().skip(list.size() -5).limit(2).forEach(System.out::println);

        //Вибрати всі елементи в яких є більше ніж 3 букви у слові
        System.out.println("Вибрає всі елементи в яких є більше ніж 3 букви у слові");
        list.stream()
                .filter(element -> element.length() > 3)
                .forEach(System.out::println);

        //Повернути колекції без дублікатів
        System.out.println("Повертає колекції без дублікатів");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        //Знайти чи існують хоч один «One» елемент в колекції
        System.out.println("Знаходить чи існують хоч один «One» елемент в колекції");
        try {
           String thOne = list.stream().filter(s -> s.equals("One")).findAny()
                    .orElseThrow(() -> new Exception("No word o"));
            System.out.println(thOne);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Знайти чи є символ «o» у всіх елементів колекції
        System.out.println("Знаходить чи є символ «o» у всіх елементів колекції");
        long count = list.stream().filter((s) -> s.contains("o"))
                .count();
        System.out.println(count);

        // Додати "_1" до кожного елементу колекції
        System.out.println("Додаємо _1 до кожного елементу колекції");
        list.stream()
                .map(element -> element + " _1 ")
                .forEach(System.out::println);

        //Відсортувати колекцію рядків за алфавітом і прибрати дублікати
        System.out.println("Відсортовано колекцію рядків за алфавітом і прибрав дублікати");
        List<String> sortedList = list.stream().sorted().distinct().collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }
}
