package com.myjava.string;

/**
 * Below example shows how to find whether a string value start with another string value. By using startsWith() method,
 * you can get whether the string starts with the given string or not. Also this method tells that the string occurence
 * at a specific position. - See more at: http://java2novice.com/java_string_examples/starts_with/#sthash.feXtH6iU.dpuf
 * @author sony
 */
public class MyStrStartsWith {
	public static void main(String a[]) {
		String str = "This is an example string.";
		System.out.println("Is this string starts with \"This\"? " + str.startsWith("This"));
		System.out.println("Is this string starts with \"is\"? " + str.startsWith("is"));
		System.out.println("Is this string starts with \"is\" after index 5? " + str.startsWith("is", 5));
	}
}