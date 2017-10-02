package question_collections;

import java.util.ArrayList;
import java.util.List;

public class Longs {

    public static void main(String[] args) {
        List longs = new ArrayList<Long>();
        longs.add(1L);
        longs.add(1.0);
        longs.add(new Object());
        longs.add("I m a long.");

        System.out.println(longs.size());



    }
}
