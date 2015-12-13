package com.myjava.constructors;

/**
 * Default constructor refers to a constructor that is automatically created by compiler in the absence of explicit
 * constructors. You can also call a constructor without parameters as default constructor because all of its class
 * instance variables are set to default values. - See more at:
 * http://java2novice.com/java_constructor_examples/default_constructor/#sthash.CUK1wF0O.dpuf * 
 * @author java2novice
 */
public class MyDefaultConstructor {
	public MyDefaultConstructor() {
		System.out.println("I am inside default constructor...");
	}

	@SuppressWarnings("unused")
	public static void main(String a[]) {
		MyDefaultConstructor mdc = new MyDefaultConstructor();
	}
}