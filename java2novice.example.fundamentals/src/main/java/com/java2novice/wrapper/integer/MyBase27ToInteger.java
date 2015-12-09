package com.java2novice.wrapper.integer;

/**
 * By using Integer.parseInt() method, and passing radix value as 27, we can convert string to integer value.
 * @see more at: http://java2novice.com/java-fundamentals/integer/radix-27/#sthash.MKYazcg9.dpuf
 * @author java2novice
 * @date 2015年12月9日下午4:21:31
 */
public class MyBase27ToInteger {
	public static void main(String a[]) {
		String str = "adef";
		Integer i = Integer.parseInt(str, 27);
		System.out.println("Integer value: " + i);
	}
}