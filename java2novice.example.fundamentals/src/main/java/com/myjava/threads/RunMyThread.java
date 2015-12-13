package com.myjava.threads;

/**
 * A Thread can be created by extending Thread class also. But Java allows only one class to extend, it wont allow
 * multiple inheritance. So it is always better to create a thread by implementing Runnable interface. Java allows you
 * to impliment multiple interfaces at a time.<br>
 * By implementing Runnable interface, you need to provide implementation for run() method.<br>
 * To run this implementation class, create a Thread object, pass Runnable implementation class object to its
 * constructor. Call start() method on thread class to start executing run() method.<br>
 * Implementing Runnable interface does not create a Thread object, it only defines an entry point for threads in your
 * object. It allows you to pass the object to the Thread(Runnable implementation) constructor.<br>
 * - See more at: http://java2novice.com/java_thread_examples/implementing_runnable/#sthash.MgsC9RH8.dpuf<br>
 * @author java2novice
 */
class MyRunnableThread implements Runnable {
	public static int myCount = 0;

	public MyRunnableThread() {
	}

	public void run() {
		while (MyRunnableThread.myCount <= 10) {
			try {
				System.out.println("Expl Thread: " + (++MyRunnableThread.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in thread: " + iex.getMessage());
			}
		}
	}
}

public class RunMyThread {

	public static void main(String a[]) {
		System.out.println("Starting Main Thread...");
		MyRunnableThread mrt = new MyRunnableThread();
		Thread t = new Thread(mrt);
		t.start();
		while (MyRunnableThread.myCount <= 10) {
			try {
				System.out.println("Main Thread: " + (++MyRunnableThread.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in main thread: " + iex.getMessage());
			}
		}
		System.out.println("End of Main Thread...");
	}
}