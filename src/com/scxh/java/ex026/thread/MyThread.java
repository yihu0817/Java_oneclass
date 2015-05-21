package com.scxh.java.ex026.thread;

public class MyThread extends Thread {
	
	public void run() {
		//运行状态
		for(int i = 0; i < 10; i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Thread thread = Thread.currentThread();
			System.out.println("执行myThread线程"+ thread.getName());
		}
	}
}
