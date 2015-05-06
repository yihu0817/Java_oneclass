package com.scxh.java.classs.ex02;

/**
 * 1.类的定义 
 * 2.成员变量 
 * 3.成员方法 
 * 4.局部变量 //在方法体内定义的变量 
 * 5.构造方法 
 * 6.实例化类得到对象 
 * 7.调用变量和方法
 * 
 * 修饰符（访问修饰符 非访问修饰符） 返回值类型 方法名称(参数列表[参数类型1 参数名1,参数类型2 参数名2,...]) { 方法体 }
 * 
 * @author viktor
 * 
 */
public class Student {
	// 成员变量 也叫属性
	public static String name; // 学生姓名
	private int age; // 学生年龄
	protected float score; // 学生成绩
	{
		int a = 1;
	}
	// 成员方法
	/**
	 * 学生类构造方法 用于实例化类
	 */
	public Student() {
		System.out.println("执行学生类的构造方法");
	}

	/**
	 * 学生读书的方法
	 */
	public String read() {
		String name = "读书好"; // 局部变量
		age = 1;
		if(name.equals("张三")){
			String result = name;
			age = 1;
		}else{
			String result = name;
		}
		
		return name;
	}

	/**
	 * 学生写字的方法
	 * 
	 * @param str
	 */
	void write(String str) {
		System.out.println("写入内容是 " + str);
	}

	/**
	 * 显示学生基本信息的方法
	 */
	void show() {
		System.out.println("学生姓名 :" + name);
		System.out.println("学生年龄 :" + age);
		System.out.println("学生成绩 :" + score);
	}

	public static void main(String[] args) {
		System.out.println("===学生类Student 主方法main方法开始执行===");

		Student stu = new Student(); // 实例化 学生类Student 得到对象stu
		stu.name = "张三";
		stu.age = 18;
		stu.score = 99;

		String result = stu.read();
		System.out.println(result);

		String a = "字写的好都草书";
		stu.write(a);

		stu.show();

		System.out.println("===学生类Student 主方法main方法结束执行===");
		
		
		Student stuA = new Student();
		stuA.name = "李四";
		stuA.age = 13;
		stuA.score = 98;
		
		stuA.show();
		
	}
}
