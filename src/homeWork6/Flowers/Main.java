package homeWork6.Flowers;

public abstract class Main {
    public static void main(String[] args) {

        Flowers flowers = new Flowers("green", 20) {
            @Override
            public boolean ollFlowers() {
                return false;
            }
        };

        Lilies lilies = new Lilies("Red", 10, "lilia");
        Orchids orchids = new Orchids("Blue", 10, "orchid");
        Roses roses = new Roses("purpure", 10, "Roses");


        flowers.setColor("Green");
        flowers.setPrice(10);
        lilies.setName("Lilies");
        lilies.setPrice(20);
        orchids.setName("Orchid");
        orchids.setPrice(30);
        roses.setName("Rose");
        roses.setPrice(20);

        flowers.totalPrice();
        lilies.totalPrice();
        orchids.totalPrice();
        roses.totalPrice();

        Flowers[] flowers1 = {flowers,lilies, orchids, roses};
        for (int i = 0; i < flowers1.length; i++) {
            flowers1[i].totalPrice();
        }
    }
}
