package com.scxh.java.ex001;

public class A {

	String str1 = " \b\bHello!";
	String str2 = " How  are  you? ";

	static int a = 0;
	int b = 0;
	
	public A(){
		a++; //a = 2;
		b++; //b = 1;
	}
	
	public String toString() {
		return str1 + str2;
	}

	public static void main(String[] args) {
		A aobj = new A();
		A a1obj = new A();
		
		System.out.println(a);
		System.out.println(aobj.b+ "   ," +a1obj.b);
	}

}
