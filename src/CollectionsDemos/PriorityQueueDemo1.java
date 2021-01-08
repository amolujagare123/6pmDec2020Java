package CollectionsDemos;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 {

    public static void main(String[] args) {


        PriorityQueue pq = new PriorityQueue();

        pq.offer(34);
        pq.offer(134);
        pq.offer(341);
        pq.offer(314);
        pq.offer(24);
        pq.offer(14);
        pq.offer(54);

       // pq.offer('4');


        System.out.println(pq);



    }
}
