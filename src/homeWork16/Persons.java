package homeWork16;

import java.util.Comparator;

public class Persons {
    private String name;
    private String surname;
    private int age;

    public Persons(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public class ComparatorByNameAndSurname implements Comparator<Persons>{

        @Override
        public int compare(Persons o1, Persons o2) {
            int res = o1.getName().compareTo(o2.getName());
            if (res == 0){
                res = getSurname().compareTo(o2.getSurname());
            }
            return res;
        }
    }

    public static class ComparatorBySurnameAndName implements Comparator<Persons>{

        @Override
        public int compare(Persons o1, Persons o2) {
            int res = o1.getSurname().compareTo(o2.getSurname());
            if (res == 0){
                res = o1.getName().compareTo(o2.getName());
            }
            return res;
        }
    }
}
