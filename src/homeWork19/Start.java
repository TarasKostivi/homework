package homeWork19;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3,4,57,87);
        List<Integer> integers2 = Arrays.asList(4,7,98,45);

        DirectTheard directTheard = new DirectTheard(integers, 1500);
        DirectTheard directTheard2 = new DirectTheard(integers2, 1500);

        SortedRunnable sortedRunnable = new SortedRunnable(integers, 1500);

        Thread thread = new Thread(sortedRunnable);

        Collections.sort(integers);
        thread.start();

        directTheard.start();
        directTheard2.start();
    }
}
