package com.java2novice.linkedlist;

import java.util.LinkedList;

// Here we can see example for basic operations like creating object for LinkedList, adding objects into LinkedList,
// searching an object in LinkedList, whether it is listed under this LinkedList instance or not, checking whether the
// LinkedList is empty or not, and finally size of the LinkedList. - See more at:
// http://java2novice.com/java-collections-and-util/linkedlist/basic-operations/#sthash.Wa6gCBOG.dpuf

public class MyBasicOperations {

	public static void main(String a[]) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Orange");
		ll.add("Apple");
		ll.add("Grape");
		ll.add("Banana");
		System.out.println(ll);
		System.out.println("Size of the linked list: " + ll.size());
		System.out.println("Is LinkedList empty? " + ll.isEmpty());
		System.out.println("Does LinkedList contains 'Grape'? " + ll.contains("Grape"));
	}
}
