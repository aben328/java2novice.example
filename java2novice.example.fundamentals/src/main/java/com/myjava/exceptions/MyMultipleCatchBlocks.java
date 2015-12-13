package com.myjava.exceptions;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * A single try block can have multiple catch blocks. This is required when the try block has statements that generates
 * different types of exceptions.<br>
 * If the first catch block contains the Exception class object then the subsequent catch blocks are never executed.<br>
 * The last catch block in multiple catch blocks must contain the Exception class object. This is because, the java
 * complier gives an error saying that the subsequent catch blocks haven't been reached. This is known as Unreachable
 * code problem.<br>
 * - See more at: http://java2novice.com/java_exception_handling_examples/multiple_catch_blocks/#sthash.5BvIwnYW.dpuf
 * <br>
 * @author sony
 */
public class MyMultipleCatchBlocks {

	public static void main(String a[]) {
		MyMultipleCatchBlocks mmcb = new MyMultipleCatchBlocks();
		mmcb.execute(1);
		mmcb.execute(2);
	}

	public void execute(int i) {
		try {
			if (i == 1) {
				getIntValue("7u");
			} else {
				getUrlObj("www.junksite.com");
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Inside NumberFormatException... " + nfe.getMessage());
		} catch (MalformedURLException mue) {
			System.out.println("Inside MalformedURLException... " + mue.getMessage());
		} catch (Exception ex) {
			System.out.println("Inside Exception... " + ex.getMessage());
		}
	}

	public int getIntValue(String num) {
		return Integer.parseInt(num);
	}

	public URL getUrlObj(String urlStr) throws MalformedURLException {
		return new URL(urlStr);
	}
}