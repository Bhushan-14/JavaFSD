package CollectionFrameWork.Queue.Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo1 {
   public static void main(String[] args) {
        Deque<Object> dq = new ArrayDeque<>();
        dq.add(50);
        dq.add("abc");
        dq.add('A');
        dq.add(50);

        System.out.println(dq);
        System.out.println(dq.offer(100));
        System.out.println(dq);

        dq.addFirst("shirpur");
        System.out.println(dq);
        dq.addLast("RCPIT");
        System.out.println(dq);

        ArrayDeque<Integer> ar = new ArrayDeque<Integer>();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        ar.add(50);
        
    }
}