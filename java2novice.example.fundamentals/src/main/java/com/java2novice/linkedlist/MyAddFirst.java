package com.java2novice.linkedlist;

import java.util.LinkedList;

public class MyAddFirst {
	public static void main(String a[]) {
		LinkedList<String> arrl = new LinkedList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println(arrl);
		System.out.println("Adding element at first position...");
		arrl.addFirst("I am first");
		System.out.println(arrl);
		System.out.println("Adding element at first position...");
		arrl.offerFirst("I am first - 2");
		System.out.println(arrl);
	}
}
