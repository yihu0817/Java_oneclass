package com.scxh.java.syntax.ex_1;

import java.util.Scanner;

public class Exe3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("输入第一个数值：");
		
		Scanner reader = new Scanner(System.in); // 实例化Scanner类对象
		int year = reader.nextInt();

		System.out.println("输入第二个数值：");
		Scanner readers = new Scanner(System.in); // 实例化Scanner类对象
		int num = readers.nextInt();
		
		System.out.println("year " + year + " num :"+num);
		
		
	}

}
