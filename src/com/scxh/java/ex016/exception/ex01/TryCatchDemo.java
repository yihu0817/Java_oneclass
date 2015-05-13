package com.scxh.java.ex016.exception.ex01;

import java.util.ArrayList;

/**
 * 
 * 1.程序错误分类, 三类 
 * 2.Java异常处理机制， 运行时错误 
 * 3.运行时错误,三种情况， 1.Error 2.标准异常 3.自定义异常 
 * 4.标准异常类
 * 
 * 5.抛异常 分：1>系统抛 2>手动抛(throw throws)
 * 6.捕获异常 捕获异常书写格式
 * 
 * try {
 * 
 *   //可能引起异常的代码块
 * 
 * }catch (Exception e) { 
 *   //处理异常 
 * }finallay{
 *   //一定执行代码块
 * }
 * 7.throw 
 * 8.throws 
 * 9.finally
 * 
 * @author viktor 
 * 
 */

public class TryCatchDemo {
	public int a = 10;
	public int c = 2;
	public ArrayList<String> list;

	public static void main(String args[]) {
		TryCatchDemo obj = new TryCatchDemo();
		obj.trycatchMethod();
		// demo.arrayIndexOutofMethod();
		// demo.nullMethod();
	}

	/**
	 * 除数为零 java.lang.ArithmeticException
	 */
	public void arithmeticMethod() {
		int b = a / c;
		System.out.println("b = " + b);
	}
	
	/**
	 * 数组下标越界 java.lang.ArrayIndexOutOfBoundsException
	 */
	public void arrayIndexOutofMethod() {
		String[] str = new String[3];
		str[0] = "1";
		str[1] = "2";
		str[2] = "3";

		System.out.println(str[3]);

	}

	/**
	 * java.lang.NullPointerException
	 */
	public void nullMethod() {
		list.add("对象1");
	}

	/**
	 * 异常处理 捕获异常
	 */
	public void trycatchMethod() {
		try {

			int b = a / c;
			System.out.println("b = " + b);

			String[] str = new String[3];
			str[0] = "1";
			str[1] = "2";
			str[2] = "3";
			String d = str[3];
			System.out.println(d);

		} catch (ArithmeticException ae) {
			System.out.println("除数为零异常" + ae.getMessage());
			ae.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException aoue) {
			System.out.println("数组下标越界" + aoue.getMessage());
		} finally {
			System.out.println("finally 一定会执行的代码块");
		}
	}

	public void trycatchExceptionMethod() {
		try {

			int b = a / c;
			System.out.println("b = " + b);

			String[] str = new String[3];
			str[0] = "1";
			str[1] = "2";
			str[2] = "3";
			str[3] = "4";
			System.out.println("str[2] :" + str[2]);

		} catch (Exception ae) {
			System.out.println("异常" + ae.getMessage());

		}
	}

}
