package com.scxh.java.ex027.thread;

/**
 * 产品类，如面包 生产 put 消费 get
 * 
 * @author viktor
 * 
 */
public class Q {
	int n;

	synchronized int get() {
		int p = (int) (Math.random()*3)+1;
		n = n - p;
		
		if(n < 6){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		}
		
		System.out.println("消费者 消费第"+(n+1)+"产品 ");
		
		return n;
	}

	synchronized void put() {
		int p = (int) (Math.random()*3)+1;
		n = p + n;
		if(n > 20){
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		}
		System.out.println("生产者 生产第"+n+"产品 ");
		
	}

}
