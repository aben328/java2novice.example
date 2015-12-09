package com.java2novice.wrapper.integer;

/**
 * By using Integer.parseInt() method, and passing radix value as 9, we can convert octal to integer value. - See more
 * at: http://java2novice.com/java-fundamentals/integer/octal-to-integer/#sthash.APb8QbIO.dpuf
 * @author java2novice
 * @date 2015年12月9日下午4:19:09
 */
public class MyOctalToInteger {
	public static void main(String a[]) {
		String octal = "7776";
		Integer i = Integer.parseInt(octal, 8);
		System.out.println("Integer value: " + i);
		// Integer value: 4094
	}
}