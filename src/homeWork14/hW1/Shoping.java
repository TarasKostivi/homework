package homeWork14.hW1;

public class Shoping implements Comparable<Shoping> {
    private String nameProduct;
    private int sumProduct;

    public Shoping(String nameProduct, int sumProduct) {
        this.nameProduct = nameProduct;
        this.sumProduct = sumProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getSumProduct() {
        return sumProduct;
    }

    public void setSumProduct(int sumProduct) {
        this.sumProduct = sumProduct;
    }

    @Override
    public String toString() {
        return nameProduct +" "+ getSumProduct();
    }


    @Override
    public int compareTo(Shoping o) {
        if (this.getNameProduct().compareTo(o.getNameProduct()) > 0){
            return 1;
        } else if (this.getNameProduct().compareTo(o.getNameProduct()) < 0){
             return -1;
        }else {
            return 0;
        }
    }
}
