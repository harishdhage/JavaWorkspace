package collectionPack.ListConcept.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = new ArrayList<>();
		List<String> x=null;
		l.add("Apple");
		l.add("Mango");
		l.add("Chikoo");
		l.set(1, "Banana");
//		l.add(null);
		l.add("Bread");
		l.remove(0);
		List copyList = List.copyOf(l); //Not allowed to add null and it unmodifiable list
//		copyList.add("Flower");
//		copyList.remove(1);
		l.add(null);
		System.out.println("CopyList : "+copyList);
		l.add("Chikoo");
		l.add("Bread");
		System.out.println("********** List *************");
		System.out.println(l);
		l.set(1,"Chicken");
		l.remove("Banana");
//		l.replaceAll("Appls","");
		System.out.println(l.size()+" || "+l);
		System.out.println("List.of() : "+List.of(l));
		System.out.println("List.of() : "+List.of(l,"Another Str"));
		System.out.println("Last Index Of "+l.lastIndexOf("Bread"));
		System.out.println(l.indexOf("Bread"));

		//of() wont allow the null object and null elements
//		System.out.println("List.of() : "+List.of(x));
//		System.out.println("List.of() : "+List.of(null));

		System.out.println("******* ArrayList ***********");
		ArrayList<String> al = new ArrayList<>();
		al.add("Apple");
		al.add("Mango");
		al.add("Chikoo");
		al.add(1, "Banana");
		al.add(null);
		al.add("Bread");
		al.remove(0);
		al.set(1, "Pomogranite");
		al.add("Banana");
		System.out.println("SubList : "+al.subList(0,3));
//		System.out.println("Sort : "+al.sort());
		System.out.println(">> "+al.indexOf("Pomogranite"));
		System.out.println(">> "+al.lastIndexOf("Banana"));
		System.out.println(al.size()+" || "+al);
		
		System.out.println("******* LinkedList ***********");
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Apple");
		ll.add("Mango");
		ll.add("Chikoo");
		ll.add(1, "Banana");
		ll.add(null);
		ll.add("Bread");
		ll.remove(0);
		ll.set(1, "Pomogranite");
		ll.add("Banana");
		System.out.println(ll.size()+" || "+ll);
	}

}
