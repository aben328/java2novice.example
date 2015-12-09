package com.java2novice.math;

/**
 * We can get ceiling value of a number by caling Math.ceil() method. 
 * It returns the smallest integer which is not less
 * than the argument value. Below example shows how to get ceil value. - !See more at:
 * http://java2novice.com/java-fundamentals/math/ceil/#sthash.3e7hRGob.dpuf
 * @author java2novice
 * @date 2015年12月9日下午4:49:59
 */
public class MyCeilEx {
	public static void main(String[] args) {
		System.out.println("Ceiling value of 45: " + Math.ceil(45));
		System.out.println("Ceiling value of -45.6: " + Math.ceil(-45.6));
		System.out.println("Ceiling value of 72.1: " + Math.ceil(72.1));
		System.out.println("Ceiling value of 45.3: " + Math.ceil(45.3));
	}
}

//Ceiling value of 45: 45.0
//Ceiling value of -45.6: -45.0
//Ceiling value of 72.1: 73.0
//Ceiling value of 45.3: 46.0
