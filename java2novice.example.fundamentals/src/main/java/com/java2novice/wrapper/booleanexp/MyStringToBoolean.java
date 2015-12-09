package com.java2novice.wrapper.booleanexp;

/**
 * Boolean.parseBoolean() method can convert string to boolean conversion. - See more at:
 * http://java2novice.com/java-fundamentals/boolean/to-string/#sthash.7zfGFrNW.dpuf
 * @author java2novice
 * @date 2015年12月9日下午4:40:52
 */
public class MyStringToBoolean {

	public static void main(String a[]) {
		String strBol = "true";
		Boolean bol = Boolean.parseBoolean(strBol);
		System.out.println(bol);
	}
}