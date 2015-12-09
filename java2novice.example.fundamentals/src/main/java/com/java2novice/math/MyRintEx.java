package com.java2novice.math;

/**
 * Math.rint() (四舍五入) method returns the double value that is closest in value to the argument and is equal to a
 * mathematical integer. @see more at: http://java2novice.com/java-fundamentals/math/rint/#sthash.L9hNkSMy.dpuf
 * @author java2novice
 * @date 2015年12月9日下午5:34:44
 */
public class MyRintEx {
	
	public static void main(String a[]) {
		System.out.println("rint value of 12.345 is: " + Math.rint(12.345));
		System.out.println("rint value of 24.298 is: " + Math.rint(24.298));
		System.out.println("rint value of 76.65 is: " + Math.rint(76.65));
	}
}

//rint value of 12.345 is: 12.0
//rint value of 24.298 is: 24.0
//rint value of 76.65 is: 77.0
