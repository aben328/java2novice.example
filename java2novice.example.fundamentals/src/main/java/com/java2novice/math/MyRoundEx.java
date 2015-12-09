package com.java2novice.math;

/**
 * Math.round() method returns closest integer or long value for the given decimal value.
 * @See more at: http://java2novice.com/java-fundamentals/math/round-off/#sthash.ByNaU4jo.dpuf
 * @author java2novice
 * @date 2015年12月9日下午5:37:03
 */
public class MyRoundEx {
	public static void main(String a[]) {
		System.out.println("23.2 after rounding: " + Math.round(23.2));
		System.out.println("16.8 after rounding: " + Math.round(16.8));
		System.out.println("15.5 after rounding: " + Math.round(15.5));
	}
}

//23.2 after rounding: 23
//16.8 after rounding: 17
//15.5 after rounding: 16
