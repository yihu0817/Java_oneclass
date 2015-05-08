package com.scxh.java.ex006.classs.class_object;

import static com.scxh.java.ex006.classs.class_object.Student.name;

/**
 * 静态方法里只能访问静态变量，不能使用实例变量
 * @author viktor
 *
 */
public class Ex01 {
	static int i;
	static String str;
	static boolean flag;
	
	static{
		int i;
		String str;
		boolean flag;
	}
	
	int j;

	public static void main(String[] args) {
		Ex01 obj1 = new Ex01();
		obj1.j = 20;

		
		Ex01 obj2 = new Ex01();

		System.out.println("obj1.i=" + obj1.i + ", obj1.j=" + obj1.j);
		
		System.out.println("obj2.i=" + obj2.i + ", obj2.j=" + obj2.j);
		
	}
	
	public static void show(){
		int a = i;
		System.out.println("j的值是 "+a);
		int b = 1;
		
		
	}
	
	public void print(){
		this.j = 1;
		this.i = 3;
		show();
		
		
	}
	
	public void staticImport(){
		name = "a";
	}

}
