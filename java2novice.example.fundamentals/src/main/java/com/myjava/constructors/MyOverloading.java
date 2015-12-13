package com.myjava.constructors;

/**
 * Like method overloading we can overload constructors also. Along with default constructor, we can have constructors
 * with parameters. The no of parameters can be same, and it can have different datatypes. Below example gives sample
 * code for constructors overloading. - See more at:
 * http://java2novice.com/java_constructor_examples/constructor_overloading/#sthash.rJOrxvn4.dpuf
 * @author java2novice
 */
public class MyOverloading {

	public MyOverloading() {
		System.out.println("Inside default constructor");
	}

	public MyOverloading(int i) {
		System.out.println("Inside single parameter constructor with int value");
	}

	public MyOverloading(String str) {
		System.out.println("Inside single parameter constructor with String object");
	}

	public MyOverloading(int i, int j) {
		System.out.println("Inside double parameter constructor");
	}

	@SuppressWarnings("unused")
	public static void main(String a[]) {
		MyOverloading mco = new MyOverloading();
		MyOverloading spmco = new MyOverloading(10);
		MyOverloading dpmco = new MyOverloading(10, 20);
		MyOverloading dpmco2 = new MyOverloading("java2novice");
	}
}