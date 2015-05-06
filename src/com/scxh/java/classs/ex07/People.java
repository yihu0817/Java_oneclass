package com.scxh.java.classs.ex07;

public class People {
	String name;

	public People(){
	}
	
	public People(String name){
		this.name = name;
	}
	
	public void say() {
		System.out.println("People 类我的名字是"+ name);
	}
}
