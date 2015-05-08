package com.scxh.java.ex008.classs.extend;
/**
 * 
 * @author viktor
 *
 */
public class Son extends Father{
	String name;
	int age;
	
	public Son(){
		super();
		this.name = "小明";
		this.age = 2;
		System.out.println("Son子类构造方法");
	}
	
	public Son(String name,int age){
		super("大明",24);
		
		super.name = "大明";
		super.age = 25;
		super.swiming();
		super.getGirl();
		
		this.name = name;
		this.age = age;
		this.swiming();
		
		System.out.println("Son子类构造方法");
	}

	void basketball(){
		System.out.println("打篮球");
	}
	
	void swiming(String name){
		System.out.println("儿子游泳");
	}
	
	public String getGirl() {
		return "美女";
	}
}
