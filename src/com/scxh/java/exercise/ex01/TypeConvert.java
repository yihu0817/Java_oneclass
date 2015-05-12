package com.scxh.java.exercise.ex01;

class A {
	String s = "class A";
	void show(){
		System.out.println("A show()");
	}
}

class B extends A {
	String s = "class B";
	void show(){
		System.out.println("B show()");
	}
}

public class TypeConvert {
	public static void main(String args[]) {
		B b1 = new B();
		B b2 = new B();
		
		A a1 = (A) b1;
		A a2 = b2;
		
		System.out.println(a1.s);
		System.out.println(a2.s);
		
		a1.show();
		a2.show();
		
		b1 = (B) a1;
		System.out.println(b1.s);
		System.out.println(b2.s);
	}
}