package CollectionFrameWork.set.TreeSet;
import java.util.*;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(8);
        linkedList.add(1);


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(4);

        TreeSet<Integer> sortedLinkedList = new TreeSet<>(linkedList);
        TreeSet<Integer> sortedArrayList = new TreeSet<>(arrayList);

        System.out.println(linkedList);
        System.out.println("Sorted LinkedList using TreeSet: " + sortedLinkedList);

        System.out.println(arrayList);
        System.out.println("Sorted ArrayList using TreeSet: " + sortedArrayList);


        int[] intArray = {23, 42, 13, 4, 87};
        TreeSet<Integer> sortedArray = new TreeSet<>();
        for (int num : intArray) {
            sortedArray.add(num);
        }
        System.out.println(sortedArray);
    }
}
