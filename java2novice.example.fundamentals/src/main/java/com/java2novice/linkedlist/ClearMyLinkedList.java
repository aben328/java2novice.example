package com.java2novice.linkedlist;

import java.util.LinkedList;

public class ClearMyLinkedList {
	public static void main(String a[]) {
		LinkedList<String> arrl = new LinkedList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual LinkedList:" + arrl);
		arrl.clear();
		System.out.println("After clear LinkedList:" + arrl);
	}
}