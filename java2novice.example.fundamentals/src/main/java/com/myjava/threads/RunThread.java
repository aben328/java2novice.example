package com.myjava.threads;

/**
 * A thread can be created in java by extending Thread class, where you must override run() method. Call start() method
 * to start executing the thread object.
 * @See more at:http://java2novice.com/java_thread_examples/extending_thread_class/#sthash.OuScAq38.dpuf
 * @author java2novice
 */
class MySmpThread extends Thread {

	public static int myCount = 0;

	public void run() {
		while (MySmpThread.myCount <= 10) {
			try {
				System.out.println("Expl Thread: " + (++MySmpThread.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in thread: " + iex.getMessage());
			}
		}
	}
}

public class RunThread {

	public static void main(String a[]) {
		System.out.println("Starting Main Thread...");
		MySmpThread mst = new MySmpThread();
		mst.start();
		while (MySmpThread.myCount <= 10) {
			try {
				System.out.println("Main Thread: " + (++MySmpThread.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in main thread: " + iex.getMessage());
			}
		}
		System.out.println("End of Main Thread...");
	}
}