package com.java2novice.staticexmp;

/**
 * Since static blocks will be called only once, we can use static blocks to develop singleton class. Below example
 * shows how to create singleton classes using static block. To create singleton class, make constructor as private, so
 * that you cannot create object outside of the class. Create a private static variable of same class type, so that
 * created object will be pointed to this reference. Now create static block, and create object inside static block.
 * Since static block will be called only once, the object will be created only once.
 * @see more at: http://java2novice.com/java-fundamentals/static/singleton/#sthash.qW5Hiwmw.dpuf
 * @author java2novice
 * @date 2015年12月8日上午10:32:05
 */
public class MyStaticSingleton {
	public static void main(String a[]) {
		MySingleton ms = MySingleton.getInstance();
		ms.testSingleton();
	}
}

/**
 * 静态代码块，静态变量，静态方法
 */
class MySingleton {
	private static MySingleton instance;

	static {
		instance = new MySingleton();
	}

	private MySingleton() {
		System.out.println("Creating MySingleton object...");
	}

	public static MySingleton getInstance() {
		return instance;
	}

	public void testSingleton() {
		System.out.println("Hey.... Instance got created...");
	}
}