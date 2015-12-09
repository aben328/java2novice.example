package com.java2novice.math;

/**
 * Math.copySign() method returns the first argument with the sign of the second argument. -
 * @See more at: http://java2novice.com/java-fundamentals/math/copy-sign/#sthash.ACOkJbJY.dpuf
 * @author java2novice
 * @date 2015年12月9日下午4:57:15
 */
public class MyCopySignEx {
	
	public static void main(String a[]) {
		System.out.println("After copying sign from -10, the value is: " + Math.copySign(20.5, -10));
		System.out.println("After copying sign from -3, the value is: " + Math.copySign(23.1, -3));
	}
}