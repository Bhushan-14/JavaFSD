package CollectionFrameWork.Queue.PriorityQueue;
import java.util.*;

public class PriorityQueueDemo1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(50);
        q.add(100);
        q.add(5);
        q.add(10);
        q.add(null);

        System.out.println(q);

        q.offer(34);

        System.out.println(q);
        System.out.println( q.remove());
        System.out.println(q);
        System.out.println(q.add(450));
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(20);
        pq.offer(34);
        pq.add(34);
        pq.offer(12);

        System.out.println(pq);

        Iterator itr  = pq.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(23);
        q1.add(30);
        q1.add(50);

        Queue<String> q2 = new LinkedList<>();

        q2.offer("bhushan");
        q2.offer("Hrishi");
        q2.offer("Sandip");
        q2.offer("Sagar");

//        PriorityQueue<Object> pq2 =new PriorityQueue<>();
//        pq2.addAll(q2);
//        pq2.addAll(q1);
//
//        System.out.println(pq2);
    }
}