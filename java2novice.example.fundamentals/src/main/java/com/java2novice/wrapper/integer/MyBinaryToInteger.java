package com.java2novice.wrapper.integer;

/**
 * By using Integer.parseInt() method, and passing radix value as 2, 
 * we can convert binary to integer value.
 * @author java2novice
 * @date 2015年12月9日下午3:43:18
 */
public class MyBinaryToInteger {
	public static void main(String a[]) {
		String binary = "1101001";
		Integer i = Integer.parseInt(binary, 2);
		System.out.println("Integer value: " + i);
	}
}