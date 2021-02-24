package homeWork15.hW3;

import homeWork15.Account;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animal> dog = new LinkedList<>();
        dog.add(new Animal("Barsik", "Dog"));
        List<Animal> cat = new LinkedList<>();
        cat.add(new Animal("Lise", "Cat"));
        List<Animal> dog2 = new LinkedList<>();
        dog2.add(new Animal("Juba", "Dog"));
        List<Animal> cat2 = new LinkedList<>();
        cat2.add(new Animal("Wolfi", "Cat"));

        Map<Person, List<Animal>> mapClub = new HashMap<>();
        mapClub.put(new Person("Igor", 21), dog);
        mapClub.put(new Person("Andrey", 31), cat);
        mapClub.put(new Person("Oleg", 51), dog2);
        mapClub.put(new Person("Taras", 51), cat2);


        for (Map.Entry<Person, List<Animal>> deliteAnnimal : mapClub.entrySet()){
            Person person = deliteAnnimal.getKey();
            if (person.getName().equals("Oleg") && person.getAge() == 21)
                deliteAnnimal.setValue(null);
        }

        for (Map.Entry<Person, List<Animal>> myEntry : mapClub.entrySet())
        {
            System.out.println(myEntry.getKey());
            if (myEntry.getValue() != null){
                System.out.println("Account : " + myEntry.getValue());
            }else {
                System.out.println("No Account");
            }
        }
        for (Map.Entry<Person, List<Animal>> print: mapClub.entrySet()) {
            System.out.println(print.getKey() + " " + print.getValue());
        }

        for (Map.Entry<Person, List<Animal>> deleteAnimal: mapClub.entrySet()){
            Person person = deleteAnimal.getKey();
            if (person.getName().equals("Igor")){
                mapClub.remove(person);
            }
        }

        for (Map.Entry<Person, List<Animal>> print: mapClub.entrySet()) {
            System.out.println(print.getKey() + " " + print.getValue());
        }

        System.exit(0);
    }
}
