package com.scxh.java.ex027.thread;

/**
 * 产品类，如面包 生产 put 消费 get
 * 
 * @author viktor
 * 
 */
public class Product {
	int n;
	boolean valueSet = false;

	synchronized int get() {

		if (!valueSet){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		}
		System.out.println("消费者 消费第"+(n+1)+"产品 ");
		valueSet = false;
		notify();
		return n;
	}

	synchronized void put(int n) {
		if (valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		this.n = n;
		valueSet = true;
		System.out.println("生产者 生产第"+(n+1)+"产品 ");
		notify();
	}

}
