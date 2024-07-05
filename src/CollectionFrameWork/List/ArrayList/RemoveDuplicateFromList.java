package CollectionFrameWork.List.ArrayList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
