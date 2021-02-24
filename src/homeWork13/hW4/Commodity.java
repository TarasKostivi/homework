package homeWork13.hW4;

public class Commodity {
     private String productName;
     private int productPrice;
     private int length;
     private int weight;
     private int vaga;

    public Commodity(String productName, int productPrice, int length, int weight, int vaga) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.length = length;
        this.weight = weight;
        this.vaga = vaga;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getVaga() {
        return vaga;
    }

    public void setVaga(int vaga) {
        this.vaga = vaga;
    }

    @Override
    public String toString() {
        return  productName + " " + "price " + productPrice + " " +
                "length " + length + " " + " " + "weight " + weight + " "+ "kg "+ vaga;
    }

}
