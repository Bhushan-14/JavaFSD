package CollectionFrameWork.set.HashSet;

import java.util.TreeSet;

public class TressSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(112);
        ts.add(23);
        ts.add(10);
        ts.add(45);
        ts.add(23);
        ts.add(112);
        System.out.println(ts);
    }
}
