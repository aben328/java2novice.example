package com.java2novice.arrays;

import java.util.Arrays;
import java.util.List;

/**
 * Java Arrays class provides few utility methods. One of the utility method Arrays.asList() helps us to convert an
 * Array of objects to List of objects. Below example shows how to convert array to list object.
 * @author java2novice
 * @date 2015年12月8日上午10:38:58
 */
public class ArraysToList {
	
	public static void main(String a[]) {
		String[] strArr = { "JAVA", "C++", "PERL", "STRUTS", "PLAY" };
		List<String> strList = Arrays.asList(strArr);
		System.out.println("Created List Size: " + strList.size());
		System.out.println(strList);
	}
}
