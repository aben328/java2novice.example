package com.myjava.string;

/**
 * Below example shows how to get replace character or a string into a string with the given string. String provides
 * replace() method to replace a specific character or a string which occures first. replaceAll() method replaces a
 * specific character or a string at each occurence. - @See more at:
 * http://java2novice.com/java_string_examples/replace_all/#sthash.5sGLFi1g.dpuf
 * @author sony
 */
public class MyStringReplace {

	public static void main(String a[]) {
		String str = "This is an example string";
		System.out.println("Replace char 's' with 'o':" + str.replace('s', 'o'));
		System.out.println("Replace first occurance of string\"is\" with \"ui\":" + str.replaceFirst("is", "ui"));
		System.out.println("Replacing \"is\" every where with \"no\":" + str.replaceAll("is", "no"));
	}
}