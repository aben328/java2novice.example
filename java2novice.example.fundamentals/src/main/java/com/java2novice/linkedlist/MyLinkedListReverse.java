package com.java2novice.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

// This example shows how to reverse LinkedList content. You can reverse the content by calling Collections.reverse()
// method. You have to pass LinkedList instance to this method, which reverses the content. - See more at:
// http://java2novice.com/java-collections-and-util/linkedlist/content-reverse/#sthash.YTcL7jQE.dpuf

public class MyLinkedListReverse {
	
	public static void main(String a[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("Cric");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");
		Collections.reverse(list);
		System.out.println("Results after reverse operation:");
		for (String str : list) {
			System.out.println(str);
		}
	}
}
