package CollectionsDemos;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {


        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(34);
        pq.offer(134);
        pq.offer(341);
        pq.offer(314);
        pq.offer(24);
        pq.offer(14);
        pq.offer(54);

        System.out.println(pq);

        // 14 , 24, 34 , 54  ,124 , 314 ,341

        // some operating systems doesnot support priority queue
        // so the out put is like this

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());


    }
}
