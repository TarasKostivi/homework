package homeWork8.Phones;

public class Main {
    public static void main(String[] args) {
        for (Phones phones : Phones.values()){
            System.out.println(phones.ordinal() + " - "  +  phones.getTitle() + " " + phones.getPrice());
        }

        for (Phones phones: Phones.values()){
            System.out.println(phones);
            phones.getPhone();
        }
    }
}
