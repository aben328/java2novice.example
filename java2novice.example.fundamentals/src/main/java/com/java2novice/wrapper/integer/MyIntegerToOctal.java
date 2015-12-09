package com.java2novice.wrapper.integer;

/**
 * By using Integer.toOctalString() method, we can convert integer string to octal(八进制) value.
 * @see more at: http://java2novice.com/java-fundamentals/integer/octal-value/#sthash.0vKPwrxw.dpuf
 * @author java2novice
 * @date 2015年12月9日下午3:40:17
 */
public class MyIntegerToOctal {
	public static void main(String a[]) {
		Integer i = new Integer(20);
		String octal = Integer.toOctalString(i);
		System.out.println("Octal value: " + octal);
	}
}