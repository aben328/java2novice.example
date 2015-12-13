package com.myjava.exceptions;

/**
 * The 'throws' clause in java programming language is belongs to a method to specify that the method raises particular
 * type of exception while being executed. The 'throws' clause takes arguments as a list of the objects of type
 * 'Throwables' class. Anybody calling a method with a throws clause is needed to be enclosed within the try catch
 * blocks. - See more at: http://java2novice.com/java_exception_handling_examples/throws_clause/#sthash.a8PGGvza.dpuf
 * @author sony
 */
public class MyThrowsClause {
	public static void main(String a[]) {
		MyThrowsClause mytc = new MyThrowsClause();
		try {
			for (int i = 0; i < 5; i++) {
				mytc.getJunk();
				System.out.println(i);
			}
		} catch (InterruptedException iex) {
			iex.printStackTrace();
		}
	}

	public void getJunk() throws InterruptedException {
		Thread.sleep(1000);
	}
}