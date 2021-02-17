package homeWork13.hW4;

import java.util.Comparator;

public class ComparatorByWight implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getWeight() > o2.getWeight()){
            return 1;
        }else if (o1.getLength() < o2.getLength()){
            return -1;
        }else {
            return 0;
        }
    }
}
