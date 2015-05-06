package com.scxh.java.classs.ex06;

public class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	public void say() {
		System.out.println("我是一只小动物，我的名字叫" + name + "，我会发出叫声");
	}

}
