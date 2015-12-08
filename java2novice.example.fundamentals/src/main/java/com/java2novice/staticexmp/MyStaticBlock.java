
package com.java2novice.staticexmp;

import java.util.ArrayList;
import java.util.List;

/**
 * Static blocks are nothing but a normal block of code, enclosed in braces { }, preceded with static keyword. These
 * static blocks will be called when JVM loads the class into memory. Incase a class has multiple static blocks across
 * the class, then JVM combines all these blocks as a single block of code and executes it. Static blocks will be called
 * only once, when it is loaded into memory. These are also called initialization blocks.
 * @see more at: http://java2novice.com/java-fundamentals/static/block/#sthash.edi0C0hv.dpuf
 * @author java2novice
 * @date 2015年12月8日上午10:26:36
 */
public class MyStaticBlock {

	private static List<String> list;

	static {
		// created required instances
		// create ur in-memory objects here
		list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
	}

	public void testList() {
		System.out.println(list);
	}

	public static void main(String a[]) {
		MyStaticBlock msb = new MyStaticBlock();
		msb.testList();
	}
}
