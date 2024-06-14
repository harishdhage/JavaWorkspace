package collectionPack.QueueConcept.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(20);
        priorityQueue.add(17);
        priorityQueue.add(24);
        priorityQueue.add(17);
//        priorityQueue.add(null); Not allowed null
        priorityQueue.add(31);
        priorityQueue.add(15);

        System.out.println(priorityQueue);

        Iterator<Integer> iterator = priorityQueue.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        System.out.println(priorityQueue.offer(1));
//        System.out.println("After offer : "+priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println("After Poll : "+priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println("After Peek : "+priorityQueue);
        System.out.println(priorityQueue.element());
        System.out.println("After element : "+priorityQueue);
        System.out.println(priorityQueue.remove());
        System.out.println("After Remove : "+priorityQueue);
        System.out.println(priorityQueue.remove(17));
        System.out.println("After Remove req ele : "+priorityQueue);
        System.out.println(priorityQueue.offer(28));
        System.out.println("After offer : "+priorityQueue);

    }
}
