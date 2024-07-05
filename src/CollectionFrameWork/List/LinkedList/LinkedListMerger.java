package CollectionFrameWork.List.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListMerger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        System.out.println("Enter value of n and m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter n elements in Linked List:");
        for (int i = 0; i < n; i++) {
            l1.add(sc.nextInt());
        }
        System.out.println("Linked List l1: " + l1);
        System.out.println("Enter m elements in Linked List:");
        for (int i = 0; i < m; i++) {
            l2.add(sc.nextInt());
        }
        System.out.println("Linked List l2: " + l2);
        LinkedList<Integer> mergedList = mergeList(l1, l2);
        System.out.println("Merged and sorted Linked List: " + mergedList);
    }

    private static LinkedList<Integer> mergeList(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> mergedList = new LinkedList<>(l1);
        mergedList.addAll(l2);
        Collections.sort(mergedList);
        return mergedList;
    }
}
