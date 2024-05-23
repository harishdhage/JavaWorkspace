package collectionPack.SetConcept;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<>();
		Set<String> s1=null;
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add(null); // One null is allowed
		set.add("Apple");
		set.add("April");
		set.remove(2);
		System.out.println("******** Set ************");
		System.out.println(set.size()+" || "+set);
		System.out.println(Set.of(set)+" Set.of() ");
		//null element and null object is not allowed for of()
//		System.out.println(Set.of(s1)+" Set.of() ");
//		System.out.println(Set.of(null)+" Set.of() ");
//		System.out.println("copyOf() "+Set.copyOf(s1));
		System.out.println("");


		System.out.println("********** SortedSet **********");
		SortedSet<String> ss = new TreeSet<>();
		try {
			System.out.println(ss.first());
		}catch (NoSuchElementException nsee){
			System.out.println("NSEE thrown while retrivieving a empty sorted set!!!");
		}
		ss.addAll(set);
//		ss.add(null); Null is not allowed
		ss.add("Apple");
		try {
			ss.add(null);
		}catch (NullPointerException npe){
			System.out.println("NPE thrown while adding null!!!");
		}
		
		System.out.println(ss.size()+" || "+ss);
		System.out.println("********** HashSet **********");
		HashSet<String> hs = new HashSet<>();
		hs.addAll(set);
		hs.add("Apple");
		hs.add(null);
		hs.remove(1);
		System.out.println(hs.size()+" || "+hs);
		
		System.out.println("********** LinkedHashSet **********");
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.addAll(set);
		lhs.add("Apple");
		lhs.add(null);
		lhs.remove(1);
		System.out.println(lhs.size()+" || "+lhs);
		
		System.out.println("********** TreeSet **********");
		TreeSet<String> ts = new TreeSet<>();
		ts.addAll(set);
		ts.add("Apple");
//		ts.add(null);
		ts.remove("Apple");
		ts.add("Mapple");
		System.out.println(ts.size()+" || "+ts);

		System.out.println("**********toArray() method demonstrait********");
		System.out.println(ts.toArray());
		
	}

}
