package com.myjava.threads;

/**
 * You can make any java thread as daemon thread. Daemon threads acts like service providers for other threads running
 * in the same process.<br>
 * Daemon threads will be terminated by the JVM when there are none of the other threads running, it includs main thread
 * of execution as well.<br>
 * To specify that a thread is a daemon thread, call the setDaemon method with the argument true.<br>
 * To determine if a thread is a daemon thread, use the accessor method isDaemon.<br>
 * 当线程只剩下守护线程的时候，JVM就会退出.但是如果还有其他的任意一个用户线程还在，JVM就不会退出.<br>
 * 
 * @see more at: http://java2novice.com/java_thread_examples/daemon_threads/#sthash.6otvTjrr.dpuf<br>
 * @see http://www.cnblogs.com/ChrisWang/archive/2009/11/28/1612815.html
 * @author java2novice
 */
public class DaemonThread extends Thread {

	public DaemonThread() {
		setDaemon(true);
	}

	public void run() {
		System.out.println("Is this thread Daemon? - " + isDaemon());
	}

	public static void main(String a[]) {
		DaemonThread dt = new DaemonThread();
		// even you can set daemon constrain here also
		// it is like dt.setDeamon(true)
		dt.start();
	}
}