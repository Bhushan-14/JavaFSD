package CollectionFrameWork.set.TreeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;


public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> ss = new TreeSet<>();
        ss.add("W");
        ss.add("A");
        ss.add("R");
        ss.add("E");
        ss.add("N");

        System.out.println(ss);

        SortedSet<String> ss1 = new TreeSet<>(Comparator.reverseOrder());
        ss1.add("W");
        ss1.add("A");
        ss1.add("R");
        ss1.add("E");
        ss1.add("N");

        System.out.println(ss1);
    }
}
