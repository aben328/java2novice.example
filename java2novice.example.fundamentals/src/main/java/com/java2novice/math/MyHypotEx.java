package com.java2novice.math;

/**
 * In geometry, a hypotenuse is the longest side of a right-angled triangle, the side opposite the right angle. The
 * length of the hypotenuse of a right triangle can be found using the Pythagorean theorem, which states that the square
 * of the length of the hypotenuse equals the sum of the squares of the lengths of the other two sides. - See more at:
 * http://java2novice.com/java-fundamentals/math/hypotenuse-length/#sthash.iU33FRhV.dpuf<br>
 * 计算直角三角形的斜边长<br>
 * @author java2novice
 * @date 2015年12月9日下午5:15:04
 */
public class MyHypotEx {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		// 计算直角三角形的斜边长
		System.out.println("The length of hypotenuse is: " + Math.hypot(x, y));
	}
}