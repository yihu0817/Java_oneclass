package com.scxh.java.ex027.thread;
/**
 * ЩњВњеп
 * @author viktor
 *
 */
public class Producer implements Runnable {
	Product q;

	Producer(Product q) {
		this.q = q;
		Thread thread = new Thread(this, "Producer");
		thread.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			q.put(i++);
		}
	}

}
