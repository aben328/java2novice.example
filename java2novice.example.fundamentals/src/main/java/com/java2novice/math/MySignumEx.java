package com.java2novice.math;

/**
 * Math.signum() 正负号() function returns zero if the passed argument is zero, 1.0 if the passed argument is greater than zero,
 * -1.0 if the passed argument is less than zero. - See more at:
 * http://java2novice.com/java-fundamentals/math/signum/#sthash.4tQQMj8v.dpuf
 * @author java2novice
 * @date 2015年12月9日下午5:47:20
 */
public class MySignumEx {
	public static void main(String a[]) {
		System.out.println("signum value of 20.23 is: " + Math.signum(20.23));
		System.out.println("signum value of 0 is: " + Math.signum(0));
		System.out.println("signum value of -20.23 is: " + Math.signum(-20.23));
	}
}