package com.java2novice.wrapper.integer;

/**
 * The Integer class wraps a value of the primitive type int in an object.
 * @author java2novice
 * @date 2015年12月9日下午2:14:14
 */
public class MyBasicInteger {

	public static void main(String a[]) {
		int i = 10;
		Integer intg = new Integer(i);
		System.out.println(intg);
		String no = "223";
		Integer num = new Integer(no);
		System.out.println(num);
	}
}