package homeWork16.hw1;

public class Person<T extends Comparable>
{
private String name;
private String surname;
private T age;

public Person(String name, String surname, T age)
{
    if (age.getClass().equals(String.class)){

    } else if(age.getClass().equals(Integer.class)){
        if ((Integer) age < 16){
            throw new IllegalArgumentException("Person should be older");
        }
}
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

public T getAge() {
    return age;
}

public void setAge(T age) {
    this.age = age;
}
}
