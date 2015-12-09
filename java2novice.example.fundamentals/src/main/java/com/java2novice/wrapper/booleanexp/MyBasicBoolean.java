package com.java2novice.wrapper.booleanexp;

/**
 * You can create Boolean wrapper class object by passing either boolean primitive value or boolean value as a string to
 * the Boolean constructor.
 * @see more at: http://java2novice.com/java-fundamentals/boolean/object/#sthash.YBfBUQrU.dpuf
 * @author java2novice
 * @date 2015年12月9日下午4:26:02
 */
public class MyBasicBoolean {

	public static void main(String a[]) {
		
		// Create Boolean using boolean primitive type
		boolean b1 = true;
		Boolean bObj1 = new Boolean(b1);
		System.out.println("Wrapper class Boolean output: " + bObj1);
		
		// create Boolean using string value
		Boolean bObj2 = new Boolean("false");
		System.out.println("Wrapper class Boolean output: " + bObj2);
		
		// how to get primitive boolean value from wrapper class
		System.out.println(bObj1.booleanValue());
	}
}
