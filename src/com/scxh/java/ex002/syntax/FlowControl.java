package com.scxh.java.ex002.syntax;



/**
 * 流程控制语句练习 1.如何实例化一个类 2.如何实现一个方法 3.如何调用类方法 4.了解控制输入类Scanner
 * @author viktor.zhou
 * 
 */
public class FlowControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		FlowControl flowControl = new FlowControl();
		
//		flowControl.isYear(year);
		
		flowControl.learnLoop();

	}
	/**
	 * 流程控制语句之if  else
	 * @param year
	 */
	public void isYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "是闰年。");
		} else {
			System.out.println(year + "不是闰年。");
		}
	}
	/**
	 * 流程控制语句之for
	 * 
	 */
	public void learnLoop(){
		System.out.println("====for 循环语句====");
		
		
		for(int i = 5; i < 10; i++){
			System.out.println("i :"+i);
		}
		
		
		System.out.println("====while 循环语句====");
		
		int a =4;	
		while (a < 5 ) {
			++a;
			System.out.println("a :"+a);
		}
		
		
		System.out.println("==== do while 循环语句====");
		
		
		int b = 6;
		
		
		do {
			System.out.println("b :"+b);
			b = b + 1;
//			++b;
		} while (b < 5);
		
		
	}

}
