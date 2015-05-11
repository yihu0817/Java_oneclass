package com.scxh.java.ex009.classs.overring;

public class People {
	String name = "people";

	public People(){
		System.out.println("构造方法People");
	}
	
	public People(String name){
		this.name = name;
	}
	
	public void say() {
		System.out.println("People 类我的名字是"+ name);
	}
}
