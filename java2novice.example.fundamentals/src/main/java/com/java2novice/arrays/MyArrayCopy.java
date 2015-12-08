package com.java2novice.arrays;

import java.util.Arrays;

/**
 * Program: How to copy array and increase size dynamically?<br>
 * Description:<br>
 * Java Arrays class provides few utility methods. One of the utility method Arrays.copyOf() helps us to create new
 * array with new size and copy old arrays content to the new array at the same time. Below example shows how to copy an
 * array and increase its size.<br>
 * <br>
 * @see more at: http://java2novice.com/java-arrays/array-copy/#sthash.xVVKuzAR.dpuf<br>
 * @author java2novice
 * @date 2015年12月8日上午10:44:23
 */
public class MyArrayCopy {
	public static void main(String a[]) {
		int[] myArr = { 2, 4, 2, 4, 5, 6, 3 };
		System.out.println("Array size before copy: " + myArr.length);
		int[] newArr = Arrays.copyOf(myArr, 10);
		System.out.println("New array size after copying: " + newArr.length);
	}
}