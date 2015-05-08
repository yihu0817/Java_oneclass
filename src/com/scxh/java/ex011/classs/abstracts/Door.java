package com.scxh.java.ex011.classs.abstracts;
/**
 * 抽象类  门
 * 1.具有抽象方法的类肯定是抽象类
 * 2.抽象类不一定有抽象方法
 * 3.抽象类不能被实例化
 * @author viktor
 *
 */
public abstract class Door { //抽象类：用abstract修饰不能被实例化的类
	public String doorName;
	
	public int doorColor;
	
	public Door(){
		System.out.println("door 构造方法");
	}
	
	public abstract void open(); //抽象方法 ：  没有方法体，用abstract关键字修饰的方法叫做抽象方法

	public abstract void close();
}
