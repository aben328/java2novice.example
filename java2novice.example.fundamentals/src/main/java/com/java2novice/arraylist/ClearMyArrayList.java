package com.java2novice.arraylist;

import java.util.ArrayList;

public class ClearMyArrayList {
	
	public static void main(String a[]) {
		ArrayList<String> arrl = new ArrayList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual ArrayList:" + arrl);
		arrl.clear();
		System.out.println("After clear ArrayList:" + arrl);
	}
}