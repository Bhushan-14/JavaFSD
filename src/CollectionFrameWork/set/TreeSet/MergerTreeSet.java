package CollectionFrameWork.set.TreeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MergerTreeSet {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("W");
        set1.add("A");
        set1.add("R");
        set1.add("E");
        set1.add("N");

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("B");
        set2.add("Y");
        set2.add("Z");
        set2.add("K");
        set2.add("M");

        SortedSet<String> mergedSet = new TreeSet<>();
        mergedSet.addAll(set1);
        mergedSet.addAll(set2);

        System.out.println(mergedSet);
    }
}
