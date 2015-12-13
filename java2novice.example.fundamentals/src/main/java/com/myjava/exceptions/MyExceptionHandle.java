package com.myjava.exceptions;

/**
 * Exceptions can be handled by using 'try-catch' block. Try block contains the code which is under observation for
 * exceptions. The catch block contains the remedy for the exception. If any exception occurs in the try block then the
 * control jumps to catch block.
 * @See more at: http://java2novice.com/java_exception_handling_examples/exception_handling/#sthash.TsaQNq5v.dpuf
 * @author java2novice
 */
public class MyExceptionHandle {
	
	public static void main(String a[]) {
		try {
			for (int i = 5; i >= 0; i--) {
				System.out.println(10 / i);
			}
		} catch (Exception ex) {
			System.out.println("Exception Message: " + ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("After for loop...");
	}
}