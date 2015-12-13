package com.myjava.exceptions;

/**
 * Sometimes it is required to develop meaningful exceptions based on application requirements. <br>
 * We can create our own exceptions by extending 'Exception' class. <br>
 * Below example shows how to create custom exception by extending Exception class.
 * @author sony
 */
public class MyOwnException {
	public static void main(String[] a) {
		try {
			MyOwnException.myTest(null);
		} catch (MyAppException mae) {
			System.out.println("Inside catch block: " + mae.getMessage());
		}
	}

	static void myTest(String str) throws MyAppException {
		if (str == null) {
			throw new MyAppException("String val is null");
		}
	}
}

class MyAppException extends Exception {

	private static final long serialVersionUID = -3892468992551117933L;
	private String message = null;

	public MyAppException() {
		super();
	}

	public MyAppException(String message) {
		super(message);
		this.message = message;
	}

	public MyAppException(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
