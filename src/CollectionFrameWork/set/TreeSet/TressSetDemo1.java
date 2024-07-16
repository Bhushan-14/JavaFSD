package CollectionFrameWork.set.TreeSet;

import java.util.*;

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

        System.out.println(ts.ceiling(40));
        System.out.println(ts.ceiling(45));

        System.out.println(ts.floor(40));
        System.out.println(ts.floor(45));

        System.out.println(ts.higher(40));
        System.out.println(ts.higher(45));

        System.out.println(ts.lower(40));
        System.out.println(ts.lower(45));

        System.out.println("Headset: "+ts.headSet(45,true));
        System.out.println("Headset: "+ts.headSet(45,false));
        System.out.println("Tailset: "+ts.tailSet(45,true));
        System.out.println("Tailset: "+ts.tailSet(45,false));
        System.out.println("Subset: "+ts.subSet(45,110));

        System.out.println("Iterator");
        Iterator itr = ts.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Descending iterator");
        Iterator ditr = ts.descendingIterator();
        while (ditr.hasNext()){
            System.out.println(ditr.next());
        }

        System.out.println("synchronized set" +
                ": "+Collections.synchronizedSet(ts));
    }
}
