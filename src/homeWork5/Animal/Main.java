package homeWork5.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Lopard", 20, 7);

        animal.setName("Леопард");
        animal.setSpeed(20);
        animal.setAge(7);
        animal.characteristic();

        animal.setName("Бик");
        animal.setSpeed(2);
        animal.setAge(14);
        animal.characteristic();
    }
}
