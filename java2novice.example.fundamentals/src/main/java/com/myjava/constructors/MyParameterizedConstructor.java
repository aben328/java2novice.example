package com.myjava.constructors;

/**
 * Parameterized constructors are required to pass parameters on creation of objects. If we define only parameterized
 * constructors, then we cannot create an object with default constructor. <br>
 * This is because compiler will not create default constructor. You need to create default constructor explicitly. -
 * @See more at: http://java2novice.com/java_constructor_examples/constructor_with_parameters/#sthash.OU1059pf.dpuf
 * @author java2novice
 */
public class MyParameterizedConstructor {

	@SuppressWarnings("unused")
	private String name;

	public MyParameterizedConstructor(String str) {
		this.name = str;
		System.out.println("I am inside parameterized constructor.");
		System.out.println("The parameter value is: " + str);
	}

	public static void main(String a[]) {
		@SuppressWarnings("unused")
		MyParameterizedConstructor mpc = new MyParameterizedConstructor("Madhu Raj");
	}
}