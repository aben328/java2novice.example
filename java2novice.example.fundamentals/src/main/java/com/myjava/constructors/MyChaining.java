package com.myjava.constructors;

/**
 * Calling another constructor in the same class from another constructor is called constructor chaining. By using
 * this() we can call another constructor in the same class. Incase we want to call another constructor, this() should
 * be the first line in the constructor. Below example shows code for constructor chaining. - See more at:
 * http://java2novice.com/java_constructor_examples/constructor_chaining/#sthash.D09Gnhgj.dpuf
 * 在任何情况下，构造一个类的实例时，将会沿着继承链调用所有父类的构造方法，父类的构造方法在子类的构造方法之前调用，这叫做构造方法链（constructor chaining）。
 * @author java2novice
 */
public class MyChaining {

	public MyChaining() {
		System.out.println("In default constructor...");
	}

	public MyChaining(int i) {
		this();
		System.out.println("In single parameter constructor...");
	}

	public MyChaining(int i, int j) {
		this(j);
		System.out.println("In double parameter constructor...");
	}

	public static void main(String a[]) {
		@SuppressWarnings("unused")
		MyChaining ch = new MyChaining(10, 20);
	}
}
