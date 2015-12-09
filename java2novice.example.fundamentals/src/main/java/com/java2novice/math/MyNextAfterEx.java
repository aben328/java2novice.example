package com.java2novice.math;

/**
 * Math.nextAfter() method returns the floating-point number adjacent to the first argument in the direction of the <br>
 * Math.nextAfter（）方法返回在的方向相邻的第一个参数的浮点数<br>
 * second argument. - See more at: http://java2novice.com/java-fundamentals/math/next-after/#sthash.WfFdzgwk.dpuf
 * @author java2novice
 * @date 2015年12月9日下午5:28:23
 */
public class MyNextAfterEx {
	public static void main(String a[]) {
		System.out.println("Next after value of 10 in the direction of 7: " + Math.nextAfter(10, 7));
		System.out.println("Next after value of 10 in the direction of 12: " + Math.nextAfter(10, 12));
	}
}