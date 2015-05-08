package com.scxh.java.ex009.classs.cover.ex01;

public class DemoOne {
	public static void main(String[] args) {
		Animal obj;
		obj = new Animal("贝贝"); // 引用父类实例
		obj.say(); 
		
		obj = new Dog("花花");// 引用子类实例
		obj.say();
		
		if (obj instanceof Dog) {  //instanceof 作用：判读当前对象是属于那个类(子类，超类)。
			System.out.println("我是一只小狗");
		}
		
		
		if (obj instanceof Animal) {  //instanceof 作用：判读当前对象是属于那类。
			System.out.println("我是一个动物");
		}
		
		if (obj instanceof Object) {  //instanceof 作用：判读当前对象是属于那类。
			System.out.println("我是一个对象");
		}
		
		
		
		
	}
}
