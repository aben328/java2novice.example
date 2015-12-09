package com.java2novice.math;

/**
 * Math.nextUp() method returns the floating-point value adjacent to the given number in the direction of positive
 * infinity.
 * @see more at: http://java2novice.com/java-fundamentals/math/next-up/#sthash.L6G6uiCd.dpuf
 * @author java2novice
 * @date 2015年12月9日下午5:29:53
 */
public class MyNextUpEx {
	public static void main(String a[]) {
		System.out.println("Next up value for 21.3 is: " + Math.nextUp(21.3));
		System.out.println("Next up value for 29.2 is: " + Math.nextUp(29.2));
	}
}