package collectionPack.QueueConcept.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        System.out.println("ArrayDeque as Stack");
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(20);
        arrayDeque.push(13);
        arrayDeque.push(25);
        arrayDeque.push(17);
//        arrayDeque.push(null); Null is not allowed
        arrayDeque.push(25);
        System.out.println(arrayDeque);
        arrayDeque.pop();
        System.out.println("After Pop : "+arrayDeque);

        System.out.println("*************");

        System.out.println("ArrayDeque as Queue");
        ArrayDeque<Integer> arrayDeque1 = new ArrayDeque<>();
        arrayDeque1.offer(20);
        arrayDeque1.offer(13);
        arrayDeque1.offer(25);
        arrayDeque1.offer(17);
        //arrayDeque1.push(null); Null is not allowed
        arrayDeque1.offer(25);
        System.out.println(arrayDeque1);
        arrayDeque1.pop();
        System.out.println("After Pop : "+arrayDeque1);
    }
}
