package com.scxh.java.classs.ex03;

/**
 * this 关键字用来表示当前对象本身，或当前类的一个实例，通过 this 可以调用本对象的所有方法和属性。
 * 
 * @author viktor
 * 
 */
public class Dog {
	public String name;
	public int age;
	
	private static String number;
	
	public Dog() {
	}

	public Dog(String name, int age, String hungry) {
		hungry(hungry);
	}

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("我的名字是 " + this.name + ",今年" + this.age + "岁!");

		// hungry(name);
	}

	public void hungry(String name) {
		System.out.println(name + "现在饿了.");
	}

}
