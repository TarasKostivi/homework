package homeWork13.hW1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(120);

        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next() *5);
        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        listIterator = numbers.listIterator(numbers.size());
        while (listIterator.hasPrevious()){
            int num = listIterator.previous();
            System.out.println(num);
        }
    }
}
