package com.java2novice.math;

/**
 * In mathematics, the absolute value (or modulus) |a| of a real number a is the numerical value of a without regard to
 * its sign. So, for example, the absolute value of 3 is 3, and the absolute value of -3 is also 3. The absolute value
 * of a number may be thought of as its distance from zero. Below example shows how to get absolute value using
 * Math.abs() method.
 * @see more at: http://java2novice.com/java-fundamentals/math/absolute/#sthash.6Zh8HPdE.dpuf
 * @author java2novice
 * @date 2015年12月9日下午4:44:38
 */
public class MyAbsEx {

	public static void main(String[] args) {
		double a = -23.45;
		int b = 234;
		double c = 12.54;
		System.out.println("absolute value of a: " + Math.abs(a));
		System.out.println("absolute value of b: " + Math.abs(b));
		System.out.println("absolute value of c: " + Math.abs(c));
	}
}
