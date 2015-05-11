package com.scxh.java.ex009.classs.overring;
/**
 * 重写(覆盖)(overring)
 * 
 * @author viktor
 *
 */
public class Teacher extends People {
	String name = "Teacher";

	public Teacher(String name){
		//super();如果没有显示调用，默认执行。  super();
//		this.name = name;
	}
	/**
	 * 覆盖父类say方法
	 */
	public void say() {
		System.out.println("Teacher类 我的名字是" + name);
	}
	
	public void show(){
		System.out.println("Teacher类 show方法" + name);
	}
}
