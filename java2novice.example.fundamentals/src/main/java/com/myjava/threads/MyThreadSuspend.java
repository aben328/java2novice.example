package com.myjava.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * It makes current executing thread to sleep specified number of milli seconds. Below example shows sample code for
 * thread sleep - See more at: http://java2novice.com/java_thread_examples/thread_sleep/#sthash.s3Hfe8nT.dpuf
 * @author sony
 */
public class MyThreadSuspend {

	public static void main(String a[]) {
		List<ExmpThread> list = new ArrayList<ExmpThread>();
		for (int i = 0; i < 4; i++) {
			ExmpThread et = new ExmpThread(i + 10);
			list.add(et);
			et.start();
		}
		for (ExmpThread et : list) {
			try {
				// join()方法使调用该方法的线程在此之前执行完毕，也就是等待该方法的线程执行完毕后再往下继续执行。注意该方法也需要捕捉异常。
				et.join();
			} catch (InterruptedException ex) {
			}
		}
	}
}

class ExmpThread extends Thread {
	private int suspendCount;

	public ExmpThread(int count) {
		this.suspendCount = count;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			if (i % suspendCount == 0) {
				try {
					System.out.println("Thread Sleep: " + getName());
					// 使当前线程（即调用该方法的线程）暂停执行一段时间，让其他线程有机会继续执行，但它并不释放对象锁。也就是说如果有synchronized同步快，其他线程仍然不能访问共享数据。注意该方法要捕捉异常。
					Thread.sleep(500);
				} catch (InterruptedException ex) {
				}
			}
		}
	}
}
