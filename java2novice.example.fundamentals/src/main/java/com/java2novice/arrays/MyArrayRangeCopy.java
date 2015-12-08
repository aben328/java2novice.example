package com.java2novice.arrays;

import java.util.Arrays;

/**
 * Java Arrays class provides few utility methods. One of the utility method Arrays.copyOfRange() helps us to copy range
 * of object from existing array to new array. Below example shows how to copy range of object to new array.
 * @see more at: http://java2novice.com/java-arrays/array-range-copy/#sthash.lCAUOGfC.dpuf
 * @author java2novice
 * @date 2015年12月8日上午10:46:39
 */
public class MyArrayRangeCopy {
	public static void main(String a[]) {
		int[] myArr = { 2, 4, 2, 4, 5, 6, 3 };
		System.out.println("My array elements:\n");
		for (int num : myArr) {
			System.out.print(num + " ");
		}
		int[] newArr = Arrays.copyOfRange(myArr, 1, 4);
		System.out.println("\nMy new array elements:\n");
		for (int num : newArr) {
			System.out.print(num + " ");
		}
	}
}

// My array elements:
//
// 2 4 2 4 5 6 3
// My new array elements:
//
// 4 2 4
