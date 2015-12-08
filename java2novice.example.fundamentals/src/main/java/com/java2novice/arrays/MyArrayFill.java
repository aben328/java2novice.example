package com.java2novice.arrays;

import java.util.Arrays;

/**
 * Java Arrays class provides few utility methods. One of the utility method Arrays.fill() helps us to fill an empty
 * array with default values. Below example shows how to populate an array with default values. - See more at:
 * http://java2novice.com/java-arrays/array-fill/#sthash.cs5e37da.dpuf
 * @author java2novice
 * @date 2015年12月8日上午11:15:36
 */
public class MyArrayFill {
	public static void main(String a[]) {
		String[] myArr = new String[10];
		Arrays.fill(myArr, "Assigned");
		for (String str : myArr) {
			System.out.println(str);
		}
	}
}
