package com.scxh.java.ex026.thread;

public class MainThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		
		System.out.println("线程名字 :"+mainThread.getName());
		
		mainThread.setName("主线程");
		
		System.out.println("更改线程名字 :"+mainThread.getName());
		
	}
	
}
