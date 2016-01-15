package com.java2novice.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

// Here we can see example for reading all elements from LinkedList by using Iterator. Also you can iterate through the
// LinkedList based on index too. - See more at:
// http://java2novice.com/java-collections-and-util/linkedlist/iterator/#sthash.cgthN0LK.dpuf
public class MyLinkedListIterate {

	public static void main(String a[]) {
		LinkedList<String> arrl = new LinkedList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");

		Iterator<String> itr = arrl.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}