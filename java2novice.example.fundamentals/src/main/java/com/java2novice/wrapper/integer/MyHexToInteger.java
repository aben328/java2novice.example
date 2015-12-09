package com.java2novice.wrapper.integer;

/**
 * By using Integer.parseInt() method, and passing radix value as 16, we can convert hexadecimal to integer value.
 * @see more at: http://java2novice.com/java-fundamentals/integer/hex-to-integer/#sthash.zCUthUCP.dpuf
 * @author java2novice
 * @date 2015年12月9日下午4:14:10
 */
public class MyHexToInteger {

	public static void main(String a[]) {
		String hex = "FF23";
		Integer i = Integer.parseInt(hex, 16);
		System.out.println("Integer value: " + i);
	}
}