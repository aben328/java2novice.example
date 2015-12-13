package com.myjava.string;

/**
 * Below example shows how to match a string pattern with a regular expression. String.matches() method helps to match
 * the string with a regex. Below example checkes weather given string starts with "www" or not. - See more at:
 * http://java2novice.com/java_string_examples/regular_expression/#sthash.KcGJQODj.dpuf
 * @author sony
 */
public class MyStrMatches {
	public static void main(String a[]) {
		String[] str = { "www.java2novice.com", "http://java2novice.com" };
		for (int i = 0; i < str.length; i++) {
			if (str[i].matches("^www\\.(.+)")) {
				System.out.println(str[i] + " Starts with 'www'");
			} else {
				System.out.println(str[i] + " is not starts with 'www'");
			}
		}
	}
}