package com.java2novice.arrays;

import java.util.Arrays;

/**
 * Java Arrays class provides few utility methods. One of the utility method Arrays.sort() helps us to sort an Array of
 * objects. Below example shows how to sort an array. @see more at:
 * http://java2novice.com/java-arrays/array-sort/#sthash.USlGMgy2.dpuf
 * @author java2novice
 * @date 2015年12月8日上午11:16:33
 */
public class MyArraySort {
	public static void main(String a[]) {
		int[] myArr = { 3, 2, 56, 12, 98, 23, 56 };
		Arrays.sort(myArr);
		for (int str : myArr) {
			System.out.println(str);
		}
	}
}