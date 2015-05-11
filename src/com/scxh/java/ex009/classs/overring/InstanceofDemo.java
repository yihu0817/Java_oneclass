package com.scxh.java.ex009.classs.overring;
/**
 * instanceof 关键字学习
 * @author viktor
 *
 */
public class InstanceofDemo {
	public static void main(String[] args) {
		//父类变量引用子类对象。
		People obj = new Teacher("李老师");
		
		Teacher obj1 = (Teacher) obj; 
		
		if (obj1 instanceof People) {
			System.out.println("我是人类");
		}
		if (obj1 instanceof Teacher) {
			System.out.println("我是老师");
		}
	}
}
