package com.scxh.java.ex005.classs;

/**
 * 手机类
 * 
 * @author viktor.zhou
 */
public class Mobile {
	String name; // 手机名称
	String size; // 手机大小
	String color; // 手机颜色

	public Mobile(){
		
	}
	
	// 自定义构造方法
	public Mobile(String _names, String _size, String _color) {
		name = _names;
		size = _size;
		color = _color;
	}

	public void sendMessage() {
		// 发短信
	}

	public void telePhone() {
		// 打电话
	}
}
