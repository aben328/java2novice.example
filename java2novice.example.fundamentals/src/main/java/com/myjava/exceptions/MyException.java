package com.myjava.exceptions;

/**
 * Whenever exception arises, it terminates the program execution, means it stops the execution of the current java
 * program. Below example shows what happens when an exception occurs. - See more at:
 * http://java2novice.com/java_exception_handling_examples/exception_ternminates_program/#sthash.A4Juyg1P.dpuf
 * @author sony
 */
public class MyException {
	public static void main(String a[]) {
		for (int i = 5; i >= 0; i--) {
			System.out.println(10 / i);
		}
		System.out.println("After for loop...");
	}
}