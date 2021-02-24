package homeWork13.hW3;

public class Person implements Comparable<Person>{

    private String name;
    private Integer age;
    private String HeirColor;

    public Person(String name, Integer age, String heirColor) {
        this.name = name;
        this.age = age;
        HeirColor = heirColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHeirColor() {
        return HeirColor;
    }

    public void setHeirColor(String heirColor) {
        HeirColor = heirColor;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getAge() + " "  + this.getHeirColor();
    }

    @Override
    public int compareTo(Person o) {
        if (this.getHeirColor().compareTo(o.getHeirColor()) > 0){
            return 1;
        }else if (this.getHeirColor().compareTo(o.getHeirColor()) < 0){
            return -1;
        }else {
            return  0;
        }
    }
}
