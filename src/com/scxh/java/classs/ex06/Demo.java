package com.scxh.java.classs.ex06;

public class Demo {
	public static void main(String[] args) {
		Dog myDog = new Dog("花花");
		myDog.say(); // 子类的实例调用子类中的方法

		Animal myAnmial = new Animal("贝贝");
		myAnmial.say(); // 父类的实例调用父类中的方法
	}
}
