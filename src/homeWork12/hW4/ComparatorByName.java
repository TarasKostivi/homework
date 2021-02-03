package homeWork12.hW4;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o1.getProductName().compareTo(o2.getProductName());
    }

    @Override
    public boolean equals(Object obj){
        return false;
    }
}
