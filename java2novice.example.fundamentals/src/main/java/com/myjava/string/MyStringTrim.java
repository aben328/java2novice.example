package com.myjava.string;

/**
 * Below example shows how to trim spaces in the given string. The trim() function removes all kind of space characters
 * at both ends, means removes starting and trailing spaces. These space characters includes normal space, enter, new
 * line, tab, etc.
 * @See more at: http://java2novice.com/java_string_examples/trim_space/#sthash.NjMukgNF.dpuf
 * @author sony
 */
public class MyStringTrim {
	public static void main(String a[]) {
		String str = " Junk ";
		System.out.println(str.trim());
	}
}