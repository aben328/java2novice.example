package com.myjava.string;

import java.util.StringTokenizer;

/**
 * Below example shows how to remove multiple spaces from the given string.
 * @See more at: http://java2novice.com/java_string_examples/remove-multiple-spaces/#sthash.ltvgwT0T.dpuf
 * @see http://blog.csdn.net/riyunzhu/article/details/7989145
 * @author sony
 */
public class MyStrRemoveMultSpaces {
	public static void main(String a[]) {
		String str = "String With Multiple Spaces";
		// StringTokenizer是一个用来分隔String的应用类，相当于VB的split函数。
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuffer sb = new StringBuffer();
		while (st.hasMoreElements()) {
			sb.append(st.nextElement()).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}