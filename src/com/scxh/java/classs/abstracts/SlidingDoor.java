package com.scxh.java.classs.abstracts;
/**
 * 推拉门
 * @author viktor
 *
 */

public class SlidingDoor extends Door{

	@Override
	public void close() {
		System.out.println("拉动关闭门");
	}

	@Override
	public void open() {
		System.out.println("推动打开门");
	}

}
