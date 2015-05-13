package com.scxh.java.ex017.exercise.ex01;

/**
 * 创建对象过程:   new 类名();
 * 1.加载类  -> 初始化静态变量       （如果有继承关系 先初始化父类静态变量  -> 初始化子类静态变量）
 * 2.执行构造方法 -> 初始化成员变量      （如果有继承关系 先执行父类构造方法 ->初始化父类成员变量）
 * 
 * 
 * @author viktor
 *
 */

public class Demo {

	public static void main(String[] args) {
		Father obj = new Son();  //创建Son对象
		
		System.out.println(obj.str);
		obj.show();
		
		Son son = (Son)obj;
		son.hello();
	}

}
