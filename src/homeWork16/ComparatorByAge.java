package homeWork16;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Persons>
{
    @Override
    public int compare(Persons o1, Persons o2) {
        if (o1.getAge() > o2.getAge()){
            return 1;
        }else if (o1.getAge() < o2.getAge()){
            return -1;
        }else {
            return 0;
        }
    }
}

