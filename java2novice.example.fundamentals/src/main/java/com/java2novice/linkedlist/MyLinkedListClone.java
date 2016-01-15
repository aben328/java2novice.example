package com.java2novice.linkedlist;

import java.util.LinkedList;

public class MyLinkedListClone {

	public static void main(String a[]) {
		LinkedList<String> arrl = new LinkedList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual LinkedList:" + arrl);
		@SuppressWarnings("unchecked")
		LinkedList<String> copy = (LinkedList<String>) arrl.clone();
		System.out.println("Cloned LinkedList:" + copy);
	}
}