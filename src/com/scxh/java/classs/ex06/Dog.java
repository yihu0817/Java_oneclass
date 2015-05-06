package com.scxh.java.classs.ex06;

public class Dog extends Animal {
	// 构造方法不能被继承，通过super()调用
	public Dog(String name) {
		super(name);
	}

	// 覆盖say() 方法
	public void say() {
		System.out.println("我是一只小狗，我的名字叫" + name + "，我会发出汪汪的叫声");
	}
}
