package com.scxh.java.ex017.exercise.ex01;

public class Father {
	String str = "father";
	static int b = 9;
	public Father() {
		show();
		say();
	}

	public void show() {
		System.out.println("father show " + str);
	}

	public void say() {
		System.out.println("father say " + str);
	}
}

