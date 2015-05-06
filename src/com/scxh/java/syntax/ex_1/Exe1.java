package com.scxh.java.syntax.ex_1;

import com.scxh.java.classs.ex02.Student;

/**
 * 输出1～100内前5个可以被3整除的数。
 * 
 * @author viktor.zhou
 * 
 */
public class Exe1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int b = 0;
		do {
			b = b + 1;
		} while (b < 5);

		System.out.println("循\\环结束\n第一个\"Java\"程序");
		
		byte a=(byte)128;  //a值是-128
		byte c=(byte)(-129);  //c值是127
		
		System.out.println("a :"+a + " c :"+c);
		
	}

}
