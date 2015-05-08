package com.scxh.java.ex011.classs.abstracts;

/**
 * 卷帘门
 * 
 * @author viktor
 * 
 */
public class RollingDoor extends Door {

	public RollingDoor(){
		System.out.println("RollingDoor 构造方法");
	}
	
	@Override
	public void close() {
		System.out.println("向下拉关闭");

	}

	@Override
	public void open() {
		System.out.println("向上推打开");

	}

}
