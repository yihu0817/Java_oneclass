package com.scxh.java.ex027.thread;

public class TestProduce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product p = new Product();
		Producer producer = new Producer(p);
		Consumer consumer = new Consumer(p);
		
		

	}

}
