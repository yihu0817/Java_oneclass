package com.scxh.java.ex017.exercise.ex01;

public class Son extends Father {
	String str = "son";
	static int a = 10;
	
	public Son() {
		super.show();
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
