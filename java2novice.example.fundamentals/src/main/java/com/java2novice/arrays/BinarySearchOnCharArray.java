package com.java2novice.arrays;

import java.util.Arrays;

/**
 * Java Arrays class provides few utility methods. One of the utility method Arrays.binarySearch() helps us to find an
 * object from an array of objects by using binary search algo. Below example shows how to search an objcet using binary
 * search.
 * @author java2novice
 * @date 2015年12月8日上午10:41:17
 */
public class BinarySearchOnCharArray {
	public static void main(String a[]) {
		char[] chrArr = { 'a', 'c', 'd', 'y', 'e', 'q', 'b' };
		int index = Arrays.binarySearch(chrArr, 0, chrArr.length - 1, 'q');
		System.out.println("Char 'q' index is: " + index);
	}
}
