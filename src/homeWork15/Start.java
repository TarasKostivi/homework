package homeWork15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Persons> people = new ArrayList<>();
        people.add(new Persons("Ivan", "Fetch", 22));
        people.add(new Persons("San", "Tetcol", 43));
        people.add(new Persons("Aoman", "Hetch", 34));

        print(people);

        // По імені і прізвищу використовуючи внутрішній клас.
        Persons.ComparatorByNameAndSurname comparator1  = people.get(0).new ComparatorByNameAndSurname();
        Collections.sort(people, comparator1);
        print(people);

        // По віку використовуючи внутрішній локальний клас.
        ComparatorByAge comparator2 = new ComparatorByAge();
        Collections.sort(people, comparator2);
        print(people);

        // По імені і віку використовуючи внутрішній анонімний клас.
        Collections.sort(people, new Comparator<Persons>() {
            @Override
            public int compare(Persons o1, Persons o2) {
                int res = o1.getName().compareTo(o2.getName());
                if (res == 0){
                    if (o1.getAge() > o2.getAge()){
                        return 1;
                    }else if (o1.getAge() < o2.getAge()){
                        return -1;
                    }else {
                        return 0;
                    }
                }
                return res;
            }
        });
        print(people);
        // По прізвищу i імені використовуючи вкладений статичний клас.
        Persons.ComparatorBySurnameAndName comparator3 = new Persons.ComparatorBySurnameAndName();
        Collections.sort(people, comparator3);
        print(people);

    }

    private static void print(List<Persons> list){
        for (Persons persons : list) {
            System.out.println(persons.getName() + " " + persons.getSurname() + " " + persons.getAge());
        }
        System.out.println();
    }
}
