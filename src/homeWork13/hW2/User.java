package homeWork13.hW2;

public class User implements Comparable<User> {
    private String name;
    private Integer age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + email;
    }

    @Override
    public int compareTo(User user) {
        int result = this.name.compareTo(user.name);
        if (result == 0){
            result = this.age.compareTo(user.age);
        }else {
            result = this.email.compareTo(user.email);
        }
        return  result;
    }
}
