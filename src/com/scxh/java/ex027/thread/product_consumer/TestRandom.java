package com.scxh.java.ex027.thread.product_consumer;

public class TestRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int a = (int) (Math.random() * 10)+1;
			System.out.println("a :" + a);
		}
	}

}
