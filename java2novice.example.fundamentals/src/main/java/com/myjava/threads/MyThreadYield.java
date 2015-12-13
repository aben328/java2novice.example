package com.myjava.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * When a thread executes a thread yield, the executing thread is suspended and the CPU is given to some other runnable
 * thread. This thread will wait until the CPU becomes available again. <br>
 * Technically, in process scheduler's terminology, the executing thread is put back into the ready queue of the
 * processor and waits for its next turn.<br>
 * @See more at: http://java2novice.com/java_thread_examples/thread_yield/#sthash.jX38MyZN.dpuf<br>
 * @see http://dylanxu.iteye.com/blog/1322066
 * @author sony
 */
public class MyThreadYield {

	public static void main(String a[]) {
		List<ExmpThread2> list = new ArrayList<ExmpThread2>();
		for (int i = 0; i < 3; i++) {
			ExmpThread2 et = new ExmpThread2(i + 5);
			list.add(et);
			et.start();
		}
		for (ExmpThread2 et : list) {
			try {
				et.join();
			} catch (InterruptedException ex) {
			}
		}
	}
}

class ExmpThread2 extends Thread {

	private int stopCount;

	public ExmpThread2(int count) {
		this.stopCount = count;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			if (i % stopCount == 0) {
				System.out.println("Stoping thread: " + getName());
				// 该方法与sleep()类似，只是不能由用户指定暂停多长时间，并且yield（）方法只能让同优先级的线程有执行的机会。也不会释放锁标志。
				yield();
			}
		}
	}
}