package com.java2novice.wrapper.integer;

/**
 * Program: How to convert String to signed decimal integer value? - See more at: By using Integer.parseInt() method, we
 * can convert String to singned decimal integer value.
 * @see more at: http://java2novice.com/java-fundamentals/integer/string-signed-decimal/#sthash.kLRRsZ4b.dpuf
 * @author java2novice
 * @date 2015年12月9日下午3:32:46
 */
public class MySignedParseInt {

	public static void main(String a[]) {
		String number = "768";
		Integer i = Integer.parseInt(number);
		System.out.println("converted integer: " + i);
		number = "-786";
		i = Integer.parseInt(number);
		System.out.println("converted integer: " + i);
	}

}