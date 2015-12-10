package com.java2novice.processbuilder;

import java.util.Map;
import java.util.Set;

/**
 * The ProcessBuilder.environment() method returns you the ProcessBuilder's environemnt. Below example shows how to read
 * it. - See more at: http://java2novice.com/java-fundamentals/process-builder/env-details/#sthash.XYvlN33d.dpuf
 * @author sony
 */
public class MyEnvDetails {
	
	public static void main(String a[]) {
		ProcessBuilder pb = new ProcessBuilder();
		Map<String, String> envMap = pb.environment();
		Set<String> keys = envMap.keySet();
		for (String key : keys) {
			System.out.println(key + " ==> " + envMap.get(key));
		}
	}
}