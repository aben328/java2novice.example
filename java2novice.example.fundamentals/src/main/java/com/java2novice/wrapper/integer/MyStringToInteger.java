
package com.java2novice.wrapper.integer;

/**
 * By using Integer.valueOf() method, we can convert String to Integer value.
 * @see more at: http://java2novice.com/java-fundamentals/integer/string-to-integer/#sthash.J2Urm2xO.dpuf
 * @author java2novice
 * @date 2015年12月9日下午3:31:06
 */
public class MyStringToInteger {
	public static void main(String a[]) {
		String str = "23";
		Integer i = Integer.valueOf(str);
		System.out.println("The integer value: " + i);
	}
}