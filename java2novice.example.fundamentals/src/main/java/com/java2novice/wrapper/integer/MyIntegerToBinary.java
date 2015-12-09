package com.java2novice.wrapper.integer;

/**
 * By using Integer.toBinaryString() method, we can convert integer string to binary(二进制) value.
 * @See more at: http://java2novice.com/java-fundamentals/integer/binary-value/#sthash.yD8SBKL6.dpuf
 * @author java2novice
 * @date 2015年12月9日下午3:33:34
 */
public class MyIntegerToBinary {

	public static void main(String a[]) {
		Integer i = new Integer(20);
		String binary = Integer.toBinaryString(i);
		System.out.println("Binary value: " + binary);
		// binary value: 10100 (除二取余)
	}
}