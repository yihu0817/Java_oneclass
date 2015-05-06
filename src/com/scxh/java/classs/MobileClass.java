package com.scxh.java.classs;

/**
 * 面向对象练习 
 * 什么是类和对象
 * 
 * @author viktor.zhou
 * 
 */
public class MobileClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建对象

		Mobile samMobile; // 声明：声明一个对象，包括对象名称和对象类型。
		samMobile = new Mobile("三星手机", "1024x768", "红色"); // 实例化：使用关键字new来创建一个对象。
		// 输出对象属性值

		System.out.println("手机名称 :" + samMobile.name + "\n 手机大小 :"
				+ samMobile.size + "\n 手机颜色 :" + samMobile.color);

		Mobile mtMobile;
		mtMobile = new Mobile("摩托手机", "480x800", "褐色");
		// 输出对象属性值

		System.out.println("手机名称 :" + mtMobile.name + "\n 手机大小 :"
				+ mtMobile.size + "\n 手机颜色 :" + mtMobile.color);

	}

}
