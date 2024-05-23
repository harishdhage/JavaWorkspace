package collectionPack.QueueConcept.Queue;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue queue = new PriorityQueue();

        System.out.println(queue.size());
        System.out.println(queue.poll());

        try {
            System.out.println(queue.remove());
        }catch (NoSuchElementException nsee){
            System.out.println("remove throws NSEE on empty queue");
        }
        System.out.println(queue.peek());
        try{
            System.out.println(queue.element());
        }catch (NoSuchElementException nsee){
            System.out.println("element throws NSEE on empty queue");
        }


        queue.add(10);
        queue.add(6);
        queue.add(10);
        queue.add(15);
        queue.add(3);
        System.out.println(queue.offer(14)); // adds element
        System.out.println(queue);
        System.out.println(queue.peek()); // returns the first element
        System.out.println(queue);
        System.out.println(queue.element()); //returns the first element
        System.out.println(queue);
        System.out.println(queue.poll()); // removes the element
        System.out.println(queue);
        System.out.println(queue.remove()); //remove the element
        System.out.println(queue);
        System.out.println(queue.offer(14)); // adds element
        System.out.println(queue);
    }
}
