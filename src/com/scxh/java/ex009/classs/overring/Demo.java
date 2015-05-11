package com.scxh.java.ex009.classs.overring;

/**
 * 向上转型
 * 向下转型
 */
public class Demo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//父类变量引用子类对象。
		People obj = new Teacher("李老师");// 将变量定义为父类的类型，却引用子类的对象，这个过程就是向上转型
		obj.say();
		
		System.out.println(obj.name);
		
		
		Teacher obj1 = (Teacher) obj; // 将向上转型后的子类对象再转成子类，调用子类的方法，这就是向下转型。
		
		System.out.println(obj1.name);
		obj1.show();
	}

}
