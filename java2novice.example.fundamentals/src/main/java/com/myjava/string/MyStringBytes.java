package com.myjava.string;

/**
 * Some times we have to convert string object into byte array. You can use getBytes() <br>
 * methode to convert string object to byte array.
 * @See more at: http://java2novice.com/java_string_examples/get_byte_array/#sthash.jd2NeHs8.dpuf
 * @author sony
 */
public class MyStringBytes {
	public static void main(String a[]) {
		String str = "core java api";
		byte[] b = str.getBytes();
		System.out.println("String length: " + str.length());
		System.out.println("Byte array length: " + b.length);
	}
}