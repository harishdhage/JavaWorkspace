package collectionPack.QueueConcept.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePerformance {
    public static void main(String[] args) {

        Queue queue = new PriorityQueue();

        System.out.println("****** PriorityQueue addition  **********");
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            queue.offer(i);
        }
        long stop = System.currentTimeMillis();

        System.out.println("PriorityQueue add : " + (stop - start));
        System.out.println("Size : " + queue.size());
        System.out.println("****** PriorityQueue remove  **********");
        start = System.currentTimeMillis();
        while (queue.size() > 0) {
            queue.poll();
        }
        stop = System.currentTimeMillis();

        System.out.println("PriorityQueue remove : " + (stop - start));
        System.out.println("Size :"+queue.size());

    }
}
