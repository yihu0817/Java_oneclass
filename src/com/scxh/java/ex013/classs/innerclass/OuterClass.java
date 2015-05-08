package com.scxh.java.ex013.classs.innerclass;


/**
 * 内部类学习
 * 
 * @author viktor
 * 
 */
public class OuterClass {
	public String outerName;

	public void show() {
		System.out.println("Outer 外部类学习  "+outerName);
	}

	public void say(){
		System.out.println("Outer 外部类学习  say()");
		
		class InnerClass{   //局部内部类
			public String innerName;
			
			public void show(){
				innerName = outerName;
				say();
				System.out.println("Inner 内部类学习  "+innerName);
				
			}
			
		}
		
	}
	
	public class InnerClass {  //成员内部类
		public String innerName;
		
		public  String number;
		
		public void show(){
			System.out.println("Inner 内部类学习  "+innerName);
		}
		
	}
	
	public static class InOuterClass{
		public String name;
	}
}


