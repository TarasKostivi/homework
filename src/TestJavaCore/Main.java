package TestJavaCore;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 Test Taras Kostiv by student Logos It
 */

public class Main {
    public static void main(String[] args) throws IOException {
        // Зчитуємо дані з файла DeviceInfo.txt за допомогою Stream
         Stream<String> deviceStream = Files
            .lines(Paths.get("C:\\Users\\Study\\IdeaProjects\\homework0\\src\\TestJavaCore\\DeviceInfo.txt"));

        //  Ділимо радки на частини мотодом split
        //  масив використовується для створення об'єкта Device і записуємо в collect і зберігаємо в зміну List<Device>
        List<Device> listDevise = deviceStream.map(s -> s.split(", "))
                .map(array -> new Device(Long.parseLong(array[0]), array[1], array[2], Integer.parseInt(array[3])))
                .collect(Collectors.toList());

        while (true) {
        // З допомогою сканера зчитуємо дані з консолі і створюємо консольне меню для користувача
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to display the list, press 1");
        System.out.println("If you want to search by serial number, press 2");
        System.out.println("If you want to display a sorted list, press 3");
        System.out.println("If you want to display price more 400, press 4");
        System.out.println("If you want to display price less 800, press 5");
        System.out.println("If you want to bring the most expensive product, press 6");

        // Записуємо зміну і зчитуємо ведене число
        int number = scanner.nextInt();
            switch (number) {
                case 1: {
                    // Виводимо список сористувачу
                    listDevise.forEach(System.out::println);
                    break;
                }
                case 2: {
                    // Шукаємо Device за серійним номером(Якщо
                    // такого Device немає кидати помилку
                    System.out.println("Enter your Serial number");
                    int num = scanner.nextInt();

                    try {
                        listDevise.stream().filter(device -> device.getSerialNumber() == num)
                                .findAny()
                                .orElseThrow(() -> new Exception("There is no such Serial Number"));

                    } catch (Exception e) {
                        e.printStackTrace();

                    }
                    break;
                }
                case 3: {
                    // Відсортовуємо список методом sorted записуємо в collect і проходимся по list forEach
                    listDevise.stream()
                            .sorted(Comparator.comparing(Device::getBrand))
                            .collect(Collectors.toList())
                            .forEach(System.out::println);
                    break;
                }
                case 4: {
                    // Виводиться Device у яких ціна більша ніж 400.
                    listDevise.stream().filter(device -> device.getPrice() > 400)
                            .collect(Collectors.toList())
                            .forEach(System.out::println);
                    break;
                }
                case 5: {
                    //Виводиться Device у яких в серійному
                    //номері є нуль(0) і ціна менша за 800.
                    listDevise.stream()
                            .filter(s -> String.valueOf(s.getSerialNumber()).contains("0"))
                            .filter(s -> s.getPrice() < 800)
                            .collect(Collectors.toList()).forEach(System.out::println);
                    break;
                }
                case 6: {
                    // Виводимо найдорожчий товар.
                    listDevise.stream().reduce((p1, p2) -> p1.getPrice() > p2.getPrice() ? p1 : p2)
                            .ifPresent(System.out::println);
                    break;
                }
                default: {
                    // Виходим із системи
                    System.exit(0);
                }
            }
        }
    }
}
