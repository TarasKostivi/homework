package homeWork6.Flowers;

public class Roses extends Flowers{
    private String name;
    public Roses(String color, double price, String name) {
        super(color, price);
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean ollFlowers() {
        return false;
    }
}

