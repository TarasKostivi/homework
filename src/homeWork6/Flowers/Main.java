package homeWork6.Flowers;

public abstract class Main {
    public static void main(String[] args) {


        Lilies lilies = new Lilies("Red", 10, "lilia");
        Orchids orchids = new Orchids("Blue", 10, "orchid");
        Roses roses = new Roses("purpure", 10, "Roses");

        lilies.setName("Lilies");
        lilies.setPrice(20);
        orchids.setName("Orchid");
        orchids.setPrice(30);
        roses.setName("Rose");
        roses.setPrice(20);


        Flowers[] flowers1 = {lilies, orchids, roses};

        for (int i = 0; i < flowers1.length; i++) {
           i += lilies.getPrice() + orchids.getPrice() + roses.getPrice();
            System.out.println(i);
        }
    }
}

