package CollectionFrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListMerger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in list1: ");
        int n = sc.nextInt();
        ArrayList<Integer> al1 = new ArrayList<>(n);
        System.out.println("Enter number of elements in list1: ");
        int m = sc.nextInt();
        ArrayList<Integer> al2 = new ArrayList<>(m);
        System.out.println("Enter Array elements in list1:");
        for (int i = 0; i < n; i++) {
            al1.add(sc.nextInt());
        }
        System.out.println("Enter Array elements in list2:");
        for (int i = 0; i < m; i++) {
            al2.add(sc.nextInt());
        }
        al1.addAll(al2);
        Collections.sort(al1);
        System.out.println("Merged lists are: "+al1);
    }
}
