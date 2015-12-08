package com.java2novice.arrays;

import java.util.Arrays;

/**
 * Description: Java Arrays class provides few utility methods. One of the utility method Arrays.deepEquals() helps us
 * to compare two arrays. This method compares the array objects each other, and returns true if both arrays are holding
 * same objects. Below example shows how to compare two arrays. - See more at:
 * http://java2novice.com/java-arrays/array-deep-equal/#sthash.SpxRw04O.dpuf
 * @author java2novice
 * @date 2015年12月8日上午10:48:26
 */
public class MyArrayDeepEquals {
	public static void main(String a[]) {
		String[] strArr = { "JAVA", "C++", "PERL", "STRUTS", "PLAY" };
		String[] strArrCopy = { "JAVA", "C++", "PERL", "STRUTS", "PLAY" };
		System.out.println("Are strArr and strArrCopy same? " + Arrays.deepEquals(strArr, strArrCopy));
		String[] strArrMod = { "JAVA", "C++", "PERL", "STRUTS" };
		System.out.println("Are strArr and strArrMod same? " + Arrays.deepEquals(strArr, strArrMod));
	}
}