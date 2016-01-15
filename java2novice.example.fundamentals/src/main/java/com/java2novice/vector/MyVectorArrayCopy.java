package com.java2novice.vector;

import java.util.Vector;

// You can copy all elements of a vector object to an array. By passing an array object to copyInto() method, you can
// copy content of a vector object to an array. - See more at:
// http://java2novice.com/java-collections-and-util/vector/vector-to-array/#sthash.PtLAEajx.dpuf
public class MyVectorArrayCopy {

	public static void main(String a[]) {
		Vector<String> vct = new Vector<String>();
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");

		System.out.println("Actual vector:" + vct);
		String[] copyArr = new String[vct.size()];
		//****
		vct.copyInto(copyArr);
		System.out.println("Copied Array content:");

		for (String str : copyArr) {
			System.out.println(str);
		}
	}
}
