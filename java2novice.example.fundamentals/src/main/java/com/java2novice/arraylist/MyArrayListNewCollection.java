package com.java2novice.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Here we can see example for copying another collection instance objects to existing ArrayList. - See more at:
 * http://java2novice.com/java-collections-and-util/arraylist/list-to-list/#sthash.bCu4FKiA.dpuf
 */
public class MyArrayListNewCollection {

	public static void main(String a[]) {
		ArrayList<String> arrl = new ArrayList<String>();
		// adding elements to the end
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual ArrayList:" + arrl);

		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		arrl.addAll(list);
		System.out.println("After Copy: " + arrl);
	}
}