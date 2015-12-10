package com.java2novice.processbuilder;

import java.io.IOException;

/**
 * By using ProcessBuilder class, you can invoke any application in java. Below example shows how to run a java class
 * using ProcessBuilder class. Here first argument takes the command, and command arguments follows after this. Here
 * first argument invokes java.exe file, and sencond argument passes MyTest.classfile to java application. You can pass
 * any number of arguments to an application. - See more at:
 * http://java2novice.com/java-fundamentals/process-builder/run-app/#sthash.YJsXlGWl.dpuf
 * @author java2novice
 */
public class MyInvokeOtherApps {

	public static void main(String a[]) {

		ProcessBuilder pb = new ProcessBuilder("java", "MyTest");
		try {
			pb.start();
			System.out.println("Process has been started.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
