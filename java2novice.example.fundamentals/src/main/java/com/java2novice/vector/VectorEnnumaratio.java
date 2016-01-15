package com.java2novice.vector;

import java.util.Enumeration;
import java.util.Vector;

// Below example shows how to iterate through vector using Enumeration object. You can get Enumeration object by calling
// elements() method. - See more at:
// http://java2novice.com/java-collections-and-util/vector/enumeration/#sthash.8f7gxwCR.dpuf

public class VectorEnnumaratio {

	public static void main(String a[]) {
		Vector<String> vct = new Vector<String>();
		// adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		Enumeration<String> enm = vct.elements();
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
	}

}
