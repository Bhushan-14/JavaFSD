package CollectionFrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>(2);
        al.add(12);
        al.add("Sagar");
        al.add("B");
        al.add(true);
        al.add("Sandip");
        System.out.println(al);
        System.out.println(al.get(3));
        System.out.println(al.equals(al.size()));
        Scanner sc = new Scanner(System.in);
        List<Object> list = new ArrayList<>();
        System.out.println("Please enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);

        System.out.println(list.add(al));
    }
}
