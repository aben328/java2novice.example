package com.java2novice.math;

/**
 * The exponential function is f(x) = ex. The Math.getExponent() method is used to get the x value of the given
 * parameter, in which the parameter is a result of exponential function calculation. <br>
 * java.lang.StrictMath.getExponent(float f) 方法返回一个浮点数表示所使用的无偏指数。它包括了一些情况： <br>
 * 如果参数为NaN或无穷大，那么结果是Float.MAX_EXPONENT+1。 (128)<br>
 * 如果参数是零或小于正常值，那么结果是Float.MIN_EXPONENT-1。(-127)<br>
 * See more at: http://java2novice.com/java-fundamentals/math/exponent-value/#sthash.cpJKph0L.dpuf
 * @author java2novice
 * @date 2015年12月9日下午5:18:27
 */
public class MyExponentEx {
	public static void main(String a[]) {
		System.out.println("Exponent value of 15.0 is: " + Math.getExponent(15.0));
		System.out.println("Exponent value of 22.0 is: " + Math.getExponent(22.0));
		System.out.println("Exponent value of 65 is: " + Math.getExponent(65));
	}
}