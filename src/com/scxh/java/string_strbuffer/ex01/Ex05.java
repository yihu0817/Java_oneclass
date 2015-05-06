package com.scxh.java.string_strbuffer.ex01;

/**
 * String,StringBuilder,StringBuffer 区别与联系
 * 
 * @author viktor
 * 
 */
public class Ex05 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "四川新华"; // 操作少量的数据使用 String；
		str = "中国" + str;
		System.out.println(str);
		
		//======================================
		StringBuffer strBuffer = new StringBuffer();// 多线程操作大量数据使用 StringBuffer。

		strBuffer.append("中国");
		strBuffer.append("四川新华");
		System.out.println(strBuffer);

		StringBuffer str1 = new StringBuffer("四川电脑");
		str1.append("学校");
		System.out.println("str1  :" + str1);

		str1.insert(2, "新华");
		System.out.println("str1  :" + str1);

		str1.delete(4, 6);

		System.out.println("str1  :" + str1);

		str1.setCharAt(0, '云');
		str1.setCharAt(1, '南');

		System.out.println("str1  :" + str1);

		str1.replace(0, 2, "四川");

		System.out.println("str1  :" + str1);

		//===============================
		StringBuilder strBuidler = new StringBuilder(); // 单线程操作大量数据使用
		// StringBuilder；
		strBuidler.append("四川话");

	}
}
