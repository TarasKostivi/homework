package homeWork6.Flowers;

public abstract class Flowers {
    private String color;
    private double price;

    public Flowers(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract boolean ollFlowers();

}
//Створити клас Квітка , який має поля :
//- колір
//- -ціна
//Створити 3-4 класи-нащадки.
//Потім скласти букет з декількох квітів та
//порахувати його ціну.
