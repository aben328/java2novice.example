package com.java2novice.vector;

import java.util.Vector;

// Below example shows how to create exactly same object as available vector object. You can use clone() method to
// create similar copy of vector. - See more at:
// http://java2novice.com/java-collections-and-util/vector/copy-clone/#sthash.lf2vCUX4.dpuf

public class MyVectorClone {

	public static void main(String a[]) {
		Vector<String> vct = new Vector<String>();
		// adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual vector:" + vct);
		@SuppressWarnings("unchecked")
		Vector<String> copy = (Vector<String>) vct.clone();
		System.out.println("Cloned vector:" + copy);
	}
}
