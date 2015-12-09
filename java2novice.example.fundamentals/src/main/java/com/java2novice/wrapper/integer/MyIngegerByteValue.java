package com.java2novice.wrapper.integer;

/**
 * Here example program gives methods to convert Integer object to primitive types like int,<br>
 * float, double, long, short.
 * @author java2novice
 * @date 2015年12月9日下午3:24:11
 */
public class MyIngegerByteValue {
	
	public static void main(String a[]) {
		Integer itr = new Integer(10);
		System.out.println("byte value: " + itr.byteValue());
		System.out.println("double value: " + itr.doubleValue());
		System.out.println("float value: " + itr.floatValue());
		System.out.println("int value: " + itr.intValue());
		System.out.println("long value: " + itr.longValue());
		System.out.println("short value: " + itr.shortValue());
	}
}
