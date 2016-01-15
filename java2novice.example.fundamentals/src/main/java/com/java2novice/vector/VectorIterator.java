package com.java2novice.vector;

import java.util.Iterator;
import java.util.Vector;

/**
 * Below example shows how to iterate through vector using iterator object. You can get iterator object by calling
 * iterator() method. - See more at:
 * http://java2novice.com/java-collections-and-util/vector/iterator/#sthash.Fi04xP41.dpuf
 */
public class VectorIterator {

	public static void main(String a[]) {
		Vector<String> vct = new Vector<String>();
		// adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		Iterator<String> itr = vct.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
