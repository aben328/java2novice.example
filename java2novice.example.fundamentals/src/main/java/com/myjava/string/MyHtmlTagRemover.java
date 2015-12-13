package com.myjava.string;

/**
 * In case if a string contains html tags, then below example helps to trim the html tags from the string. The example
 * uses regular expression to trim the html tags from the string. - See more at:
 * http://java2novice.com/java_string_examples/remove-html-tags/#sthash.cxn7LYFc.dpuf
 * @author java2novice
 */
public class MyHtmlTagRemover {
	public static void main(String a[]) {
		String text = "<B>I don't want this to be bold<\\B>";
		System.out.println(text);
		text = text.replaceAll("\\<.*?\\>", "");
		System.out.println(text);
	}
}