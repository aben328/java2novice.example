package com.java2novice.staticexmp;

/**
 * In java, static belongs to class. You can create static variables and static methods. You can call these directly by
 * using class name, without creating instance.<br>
 * <br>
 * Java static variables:<br>
 * <br>
 * Static variables are belongs to the class and not to the object. These are only once, at the starting of the
 * execution. Static variables are not part of object state<br>
 * , means there is only one copy of the values will be served to all instances. You can call static variable with
 * reference to class name without creating an object. Below example shows how to create and call static variables. Java
 * <br>
 * static methods:<br>
 * <br>
 * Static methods are also similar to static variables, you can access them with reference to class name, without
 * creating object. Inside static methods, you cannot access instance variables or instance methods. You can only access
 * static variables or static methods.<br>
 * <br>
 * @author java2novice
 * @date 2015年12月8日上午10:20:26
 */
public class MyStaticMethods {

	private String name;
	private static String staticStr = "STATIC-STRING";

	public MyStaticMethods(String n) {
		this.name = n;
	}

	public static void testStaticMethod() {
		System.out.println("Hey... I am in static method...");
		// you can call static variables here
		System.out.println(MyStaticMethods.staticStr);
		// you can not call instance variables here.
	}

	public void testObjectMethod() {
		System.out.println("Hey i am in non-static method");
		// you can also call static variables here
		System.out.println(MyStaticMethods.staticStr);
		// you can call instance variables here
		System.out.println("Name: " + this.name);
	}

	public static void main(String a[]) {
		// By using class name, you can call static method
		MyStaticMethods.testStaticMethod();
		MyStaticMethods msm = new MyStaticMethods("Java2novice");
		msm.testObjectMethod();
	}
}
