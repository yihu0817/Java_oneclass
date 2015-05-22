package com.scxh.java.ex027.thread;

/**
 * Ïû·ÑÕß
 * 
 * @author viktor
 * 
 */
public class Consumer implements Runnable {
	Product q;

	Consumer(Product q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			q.get();
		}
	}

}
