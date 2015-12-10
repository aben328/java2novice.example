package com.java2novice.processbuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Below example shows how to run operating specific command and read its output. ProcessBuilder class can helps you to
 * run any commands.
 * @see more at: http://java2novice.com/java-fundamentals/process-builder/run-os-command/#sthash.zdtY2WHz.dpuf
 * @author sony
 */
public class MyOsCommandRun {
	public static void main(String a[]) {
		InputStream is = null;
		ByteArrayOutputStream baos = null;
		ProcessBuilder pb = new ProcessBuilder("ls", "-l");
		try {
			Process prs = pb.start();
			is = prs.getInputStream();
			byte[] b = new byte[1024];
			int size = 0;
			baos = new ByteArrayOutputStream();
			while ((size = is.read(b)) != -1) {
				baos.write(b, 0, size);
			}
			System.out.println(new String(baos.toByteArray()));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
				if (baos != null)
					baos.close();
			} catch (Exception ex) {
			}
		}
	}
}