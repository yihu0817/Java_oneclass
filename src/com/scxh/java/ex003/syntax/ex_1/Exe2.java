package com.scxh.java.ex003.syntax.ex_1;

/**
 * 输出1～100内前5个可以被3整除的数。
 * 
 * @author viktor.zhou
 * 
 */
public class Exe2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int b = 1;
		int count = 0; //计数器
		while (b <= 100) {
			if (b % 3 == 0) {
				System.out.println(" b = " + b);
//				count = count + 1;
				++count;
			}
			if(count == 5){
				break;
			}
//			b = b + 1;
			++b;

		}

		System.out.println("循环结束");
	}

}
