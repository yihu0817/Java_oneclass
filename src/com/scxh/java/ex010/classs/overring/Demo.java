package com.scxh.java.ex010.classs.overring;

/**
 * 在Java中，同一个类中的多个方法可以有相同的名字，只要它们的参数列表不同就可以，这被称为方法重载(method overloading)。
 * 
 * 参数列表又叫参数签名，包括参数的类型、参数的个数和参数的顺序，只要有一个不同就叫做参数列表不同。
 * 
 * 重载是面向对象的一个基本特性。
 * 
 * @author viktor
 * 
 */
public class Demo {
	// 一个普通的方法，不带参数
	void test() {
		System.out.println("No parameters");
	}

	// 重载上面的方法，并且带了一个整型参数
	void test(int a) {
		System.out.println("a: " + a);
	}

	// 重载上面的方法，并且带了两个参数
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}
	
	void test(double a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}
	
	void test(int b, double a) {
		System.out.println("a and b: " + a + " " + b);
	}

	// 重载上面的方法，并且带了一个双精度参数
	double test(double a) {
		System.out.println("double a: " + a);
		return a * a;
	}

	public static void main(String args[]) {
		Demo obj = new Demo();
		obj.test();
		obj.test(2);
		obj.test(2, 3);
		obj.test(2.0);
	}
}
