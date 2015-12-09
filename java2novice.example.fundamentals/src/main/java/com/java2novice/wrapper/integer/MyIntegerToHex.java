package com.java2novice.wrapper.integer;

/**
 * By using Integer.toHexString() method, we can convert integer string to hexadecimal(十六进制）value.
 * @see more at: http://java2novice.com/java-fundamentals/integer/hex-value/#sthash.4q0fyOJE.dpuf
 * @author java2novice
 * @date 2015年12月9日下午3:36:15
 */
public class MyIntegerToHex {

	public static void main(String a[]) {
		Integer i = new Integer(20);
		String hex = Integer.toHexString(i);
		System.out.println("Hex value: " + hex);
	}
}