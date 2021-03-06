package com.java2novice.generics;

/**
 * As of now we have seen examples for only one type parameter. What happens in case we want to access group of objects
 * comes from same family, means extending same super class? You can restrict the generics type parameter to a certain
 * group of objects which extends same super class. You can achieve this my specifying extends <super-class> at class
 * definitions, look at the example, it gives you more comments to understand.
 */
public class MyBoundedClassEx {

	public static void main(String a[]) {
		// Creating object of sub class C and
		// passing it to BoundEx as a type parameter.
		BoundEx<C> bec = new BoundEx<C>(new C());
		bec.doRunTest();
		// Creating object of sub class B and
		// passing it to BoundEx as a type parameter.

		BoundEx<B> beb = new BoundEx<B>(new B());
		beb.doRunTest();

		// similarly passing super class A
		BoundEx<A> bea = new BoundEx<A>(new A());
		bea.doRunTest();
		
		// If you uncomment below code it will throw compiler error
		// becasue we restricted to only of type A and its sub classes.
		// BoundEx<String> bes = new BoundEx<String>(new String()); 
		// bea.doRunTest();
	}
}

class BoundEx<T extends A> {

	private T objRef;

	public BoundEx(T obj) {
		this.objRef = obj;
	}

	public void doRunTest() {
		this.objRef.printClass();
	}
}

class A {
	public void printClass() {
		System.out.println("I am in super class A");
	}
}

class B extends A {
	public void printClass() {
		System.out.println("I am in sub class B");
	}
}

class C extends A {
	public void printClass() {
		System.out.println("I am in sub class C");
	}
}
