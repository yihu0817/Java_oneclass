package com.scxh.java.syntax;
/**
 * 基本数据类型练习
 * @author viktor.zhou
 *
 */
public class DataClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // 字符型
		char webName1 = '新';
		char webName2 = '华';
		char webName3 = '苑';
		System.out.println("网站的名字是：" + webName1 + webName2 + webName3);
	
		// 整型
		short x=22;  // 十进制
		int y=022;  // 八进制
		long z=0x22L;  // 十六进制
		System.out.println("转化成十进制：x = " + x + ", y = " + y + ", z = " + z);
		
		// 浮点型
		float m = 22.45f;
		double n = 10;
		System.out.println("计算乘积：" + m + " * " + n + "=" + m*n);

		//布尔型
		boolean a = 100>10;
		boolean b = 100<10;
		System.out.println("100>10 = " + a);
		System.out.println("100<10 = " + b);

	}

}
