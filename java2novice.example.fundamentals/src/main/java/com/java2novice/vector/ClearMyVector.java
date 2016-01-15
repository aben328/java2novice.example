package com.java2novice.vector;

import java.util.Vector;

// Below example shows how to remove all elements from vector at once. You can call clear() method to delete all
// elements of a vector at one call. - See more at:
// http://java2novice.com/java-collections-and-util/vector/remove-all-elements/#sthash.WZ92Y7S0.dpuf
public class ClearMyVector {

	public static void main(String a[]) {
		Vector<String> vct = new Vector<String>();
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual vector:" + vct);
		vct.clear();
		System.out.println("After clear vector:" + vct);
	}
}