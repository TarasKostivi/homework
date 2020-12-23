package homeWork5.someMotocyrcle;

public class Main {
    public static void main(String[] args) {

        Motorcycle motorcycle = new Motorcycle();
        Motorcycle motorcycle1 = new Motorcycle("Endject", "S", 1999, "Green", 2);

        motorcycle.start();
        motorcycle.redesigned(4);
        motorcycle.redesigned("Green", 3);


    }
}
