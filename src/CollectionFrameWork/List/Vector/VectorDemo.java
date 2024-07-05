package CollectionFrameWork.List.Vector;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Object> v1 = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Initial capacity: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            v1.add(sc.nextInt());
        }
        System.out.println("Vector is: "+v1);
        v1.add("Sagar");
        v1.add(null);
        System.out.println(v1);


        List<Integer> l1 = new Vector<>();
        l1.add(12);
        l1.add(34);
        System.out.println(l1);

        v1.addAll(l1);
        System.out.println(v1);
    }
}
