package com.scxh.java.ex026.thread;

public class TestRunableThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread1 = new Thread(new RunableThread());
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.setName("one");
		thread1.start();
		
		Thread thread2 = new Thread(new RunableThread());
		thread1.setPriority(Thread.NORM_PRIORITY);
		thread2.setName("two");
		thread2.start();

		Thread thread3 = new Thread(new RunableThread());
		thread3.setPriority(Thread.MAX_PRIORITY);
		thread3.setName("three");
		thread3.start();

	}
}
