package CollectionFrameWork.List.Stack;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class StackDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s1 = new Stack<>();
        System.out.println("Enter number of elements you want to insert in Stack: ");
        int n = sc.nextInt();
        System.out.println("Enter elements is stack: ");
        for (int i = 0; i < n; i++) {
            s1.add(sc.nextInt());
        }
        System.out.println("Stack is: "+s1);
        Stack<Integer> s2 = new Stack<>();
        s2.add(12);
        s2.add(15);
        System.out.println(s2.peek());

    }
}
