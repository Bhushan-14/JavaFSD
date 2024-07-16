package CollectionFrameWork.set.LinkedHashSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(13);
        lhs.add(14);
        lhs.add(23);
        lhs.add(13);
        System.out.println(lhs);

        Iterator<Integer> iterator = lhs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        LinkedHashSet<Object> lhs2 = new LinkedHashSet<>();
        lhs2.add(12);
        lhs2.add(13);
        lhs2.add("Sagar");
        lhs2.add(null);
        lhs2.add(true);
        lhs2.add(45);

        System.out.println(lhs2);

//        LinkedHashSet<LinkedList<Integer>> lhs3 = new LinkedHashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(12);
        al.add(13);
        al.add(25);
        al.add(57);
        LinkedHashSet<Object> lhs4 = new LinkedHashSet<>();
        lhs4.add(12);
        lhs4.add(13);
//        lhs4.add(al);
//        System.out.println(lhs4);

        lhs4.addAll(al);
        System.out.println(lhs4);

        System.out.println("\nSpliterator with forEachRemaining:");
        lhs4.spliterator().forEachRemaining(
                element -> System.out.println(element));
    }
}
