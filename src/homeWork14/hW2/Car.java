package homeWork14.hW2;

public class Car implements Comparable<Car> {
    private String name;
    private int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public int compareTo(Car o) {
        if (this.getName().compareTo(o.getName()) > 0){
            return 1;
        }else if (this.getName().compareTo(o.getName()) < 0){
            return -1;
        }else {
            return  0;
        }
    }
}
