package com.scxh.java.ex009.classs.overring.ex01;

public final class Ex01 {
	final String NAME = "新华";
	
	//final 修饰的成员变量必须在声明的同时赋值，如果在声明的时候没有赋值，
	//那么只有 一次赋值的机会，而且只能在构造方法中显式赋值，然后才能使用。
	final int age;
	
	public Ex01(){
		age = 10;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	public void show(){
		String name = NAME;
		
		final int number;
		number = 10;
		
		
	}
	

}
