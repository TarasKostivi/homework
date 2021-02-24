package homeWork21;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Mark", 18);
        Person person2 = new Person("Vasul", 28);
        Person person3 = new Person("Igor", 3);
        Person person4 = new Person("Sanay", 4);
        Person person5 = new Person("Voloda", 10);
        Person person6 = new Person("Okol", 13);
        Person person7 = new Person("Papda", 68);

        List<Person> people = new ArrayList<>(Arrays.asList(person1, person2, person3,
                person4, person5, person6, person7));
        List<Person> adults = new ArrayList<>();

        people.forEach(person -> {
            if (person.getAge() >= 18){
                adults.add(person);
            }
        });

        adults.forEach(System.out::println);
        people.forEach(person -> person.setTimestamp(Instant.now()));

        List<Integer> integerListSize =new ArrayList<>();

        people.forEach(person -> integerListSize.add(person.getName().length()));
        integerListSize.forEach(System.out::println);
    }
}
