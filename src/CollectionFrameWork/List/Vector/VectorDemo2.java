package CollectionFrameWork.List.Vector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;

public class VectorDemo2 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Sagar");
        ll.add("Sandip");
        ll.add("Hrishi");
        ll.add("Shubham");
        ll.add("Riddhesh");

        Vector<Object> vector = new Vector<>();
        vector.addAll(al);
        vector.addAll(ll);
        System.out.println("Merged List and LinkedList is: "+vector);

        System.out.println("Traversing forward using Iterator:");
        Iterator<Object> itr1 = vector.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        System.out.println("Traversing backward using ListIterator:");
        ListIterator<Object> itr2 = vector.listIterator(vector.size());
        while (itr2.hasPrevious()) {
            System.out.println(itr2.previous());
        }


    }
}
