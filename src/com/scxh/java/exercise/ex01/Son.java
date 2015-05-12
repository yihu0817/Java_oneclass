package com.scxh.java.exercise.ex01;

public class Son extends Father {
	String str = "son";
	static int a = 10;
	
	public Son() {
		show();
		say();
	}

	public static void hello(){
		System.out.println("Son hello  " + a);
	}
	
	public void show() {
		System.out.println("Son show  " + str);
	}

	public void say() {
		System.out.println("Son say  " + str);
	}

}
