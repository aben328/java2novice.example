package com.java2novice.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedListSubRange {
	public static void main(String a[]) {
		LinkedList<String> arrl = new LinkedList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		arrl.add("Click");
		System.out.println("Actual LinkedList:" + arrl);
		List<String> list = arrl.subList(2, 4);
		System.out.println("Sub List: " + list);
	}
}