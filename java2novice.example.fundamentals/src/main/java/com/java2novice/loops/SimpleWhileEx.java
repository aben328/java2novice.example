package com.java2novice.loops;

/**
 * The while loop or while statement continually executes a block of statements while a particular condition is true.
 * The while syntax can be written as:<br>
 * while (expression) {<br>
 * statement(s)<br>
 * }<br>
 * The while loop evaluates expression, which must return a boolean value. If the while loop expression returns true,
 * <br>
 * then the statements with in the while block will be executed. The while loop continuesly executes the statements
 * within the block, until the expression returns false. <br>
 * Here is a simple while loop example, which executes until i value became 10:<br>
 * <br>
 * - See more at: http://java2novice.com/java-loops/while-loop/#sthash.OsHRIwDY.dpuf<br>
 * @author java2novice
 * @date 2015年12月8日下午1:13:48
 */
public class SimpleWhileEx {
	public static void main(String a[]) {
		int i = 0;
		while (i < 10) {
			// this block will executed until
			// i value became 10
			System.out.print(i + " ");
			i = i + 1;
		}
	}
}