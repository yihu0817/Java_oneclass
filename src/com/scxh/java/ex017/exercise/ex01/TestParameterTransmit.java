package com.scxh.java.ex017.exercise.ex01;

public class TestParameterTransmit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		testBasicTypeTransParameter();
		
		testTypeTransParameter();
	}

	/**
	 * 参数传递基本数据类型
	 */
	public static void testBasicTypeTransParameter() {
		int num = 5;
		System.out.println("a :" + num);

		changeValue(num);

		System.out.println("a :" + num);
	}

	/**
	 * 参数传递引用类型
	 */
	public static void testTypeTransParameter() {
		User user;  //声明一个user变量，可以指向任何User对象
		
		user = new User();
		
		user.name = "王二";

		System.out.println("11 name :" + user.name); // 王二

		changeObjectValue(user);

		System.out.println("22 name :" + user.name); // 张三
	}

	public static void changeValue(int x) {
		x = x * 2;
		System.out.println("x :" + x);
	}

	public static void changeObjectValue(User user) {
		user.name = "张三";
		System.out.println("changeObjectValue name :" + user.name); // 张三
	}

}
