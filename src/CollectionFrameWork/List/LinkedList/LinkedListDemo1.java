package CollectionFrameWork.List.LinkedList;
import java.util.*;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l1 = new LinkedList<>();
        System.out.println("Enter number of elements you want to insert in Linked List: ");
        int n = sc.nextInt();
        System.out.println("Enter elements in Linked List:");
        for (int i = 0; i < n; i++) {
            l1.add(sc.nextInt());
        }
        System.out.println("Linked List is: " + l1);
        l1.addFirst(12);
        System.out.println("Updated Linked List after adding first: " + l1);
        l1.addLast(31);
        System.out.println("Updated Linked List after adding last: " + l1);

        LinkedList<Integer> newlist = new LinkedList<>();
        newlist.add(23);
        newlist.addAll(l1);
        Collections.sort(newlist);
        System.out.println("Sorted Linked List: " + newlist);
        Collections.reverse(newlist);
        System.out.println("Reversed Linked List: " + newlist);

        System.out.println(Collections.synchronizedList(newlist));

        Iterator itr = newlist.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
