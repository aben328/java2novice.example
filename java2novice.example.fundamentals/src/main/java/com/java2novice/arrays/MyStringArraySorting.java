package com.java2novice.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Java Arrays class provides few utility methods. One of the utility method Arrays.sort() helps us to sort an Array of
 * objects by passing Comparator object, where Comparator holds the sorting logic. Below example shows how to sort an
 * array using Comparator. - See more at: http://java2novice.com/java-arrays/array-comparator-sort/#sthash.gTIhs88l.dpuf
 * @author java2novice
 * @date 2015年12月8日下午1:11:25
 */
public class MyStringArraySorting {
	public static void main(String a[]) {
		String[] strArr = { "JAVA", "C++", "PERL", "STRUTS", "PLAY" };
		Arrays.sort(strArr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		for (String str : strArr) {
			System.out.println(str);
		}
	}
}