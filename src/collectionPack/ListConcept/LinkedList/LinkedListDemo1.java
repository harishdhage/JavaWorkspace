package collectionPack.ListConcept.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo1 {

    public static void main(String[] args) {

        System.out.println("***** Dequeue interface methods *****");
        LinkedList linkedList = new LinkedList();
        linkedList.add("Eagle");
        linkedList.add("Parriot");
        linkedList.add(1,"Kage");
        linkedList.offerFirst("Chicken");
        linkedList.offerLast("ButterChicken");
        linkedList.addFirst("GUbbi");
        linkedList.addLast("KingFisher");
        linkedList.set(2, linkedList.get(2)+" Updated");
        System.out.println(linkedList.size()+" "+linkedList);
        System.out.println(linkedList.getFirst()+""+linkedList.peekFirst());
        System.out.println(linkedList.getLast()+""+linkedList.peekLast());
    }
}
