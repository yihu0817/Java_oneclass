package com.scxh.java.ex026.thread;

public class TestThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		mainThread.setName("main");
		
		MyThread myThread = new MyThread(); // 创建线程
		myThread.setName("one");
		myThread.start(); // 就绪状态

		System.out.println(myThread.isAlive() ? "one 线程正在运行" : "子线程停止运行");

		
//		try {
//			myThread.join();
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}
		
		System.out.println(myThread.isAlive() ? "one 线程正在运行" : "子线程停止运行");
		
		if (myThread.isAlive() == false) {
		
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("执行主线程");
			}
		}
	}

}
