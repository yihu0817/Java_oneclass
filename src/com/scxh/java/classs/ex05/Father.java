package com.scxh.java.classs.ex05;

public class Father{
	private String girl;

	String name;
	int age;
	
	double monney;
	String hourse;
	
	public Father(){
		System.out.println("父类默认构造方法");
	}
	
	public Father(String name,int age){
		this.name = name;
		this.age = age;
		monney = 400;
	}
	
	void swiming(){
		System.out.println("父亲游泳");
	}
	
	public String getGirl() {
		return girl;
	}
	
	
}
