package com.scxh.java.syntax;

/**
 * 运算符练习
 * 
 * @author viktor.zhou
 * 
 */
public class OperatorClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OperatorClass operatorclass;
		operatorclass = new OperatorClass();

		operatorclass.mathOperator();
		System.out.println("=========================");
		operatorclass.relationOperator();
		System.out.println("=========================");
		operatorclass.bitOperator();
		System.out.println("=========================");
		operatorclass.conditionOperator();
	}

	/**
	 * 如何定义一个方法 第一步： 方法修饰符 第二步: 方法返回值类型 第三步: 方法名称
	 */
	public void mathOperator() {
		// ============数学运算符=================
		// 自增
		int b = 1;
		int e = 2;
		int a = 3;
		e++; // e++ <=> e = e+1;

		System.out.println("e : " + e + "; a :" + (++a) + "; b :" + (b++));
		// 自减
		int f = 3;
		f--; // f-- <=> f = f-1;
		System.out.println("f :" + f);

	}

	public void relationOperator() {
		// ============逻辑运算符==================
		boolean g = true;
		boolean h = false;

		boolean gh = g && h;

		boolean gg = true;
		boolean hh = true;

		boolean gghh = gg && hh;

		boolean ggghhh = false && false;

		System.out.println("g与 h 进行与运算值 :" + gh + "  gghh :" + gghh
				+ " ggghhhh :" + ggghhh);

		// 与运算两都为true值=true, 两端都为false那么值=false; 只要有一端为false那么值=false;

		boolean x = true || false;
		boolean xx = true || true;
		boolean xxx = false || false;
		System.out.println("(true || false) 或运算值 :" + x + "; (true || true) :"
				+ xx + "; (false || false) :" + xxx);
	}

	public void bitOperator() {
		// =================位运算符======================
		boolean y = true;
		boolean yy = !y;
		System.out.println("(!true) 非运算值 :" + yy + "(!false) 非运算值 :" + !false);

		int aa = 5 << 2; // 00000101 00010100 ; 0x2^0 + 0x2^1 + 1x2^2 + 0x2^3 +
							// 1x2^4 = 20
		System.out.println(" (5<<2) = " + aa);

		int bb = 5 >> 2; // 0000 0001
		System.out.println(" (5>>2) = " + bb);

		int i = 2;
		int j = 3;

		/**
		 * 0000 0010 2 & 0000 0011 3 --------------- 0000 0010 2
		 */
		int k = i & j;
		System.out.println(" (2&3) = " + k);

		/**
		 * 0000 0010 2 | 0000 0011 3 --------------- 0000 0011 3
		 */
		int kk = i | j;
		System.out.println(" (2|3) = " + kk);

		/**
		 * ~ 0000 0011 3 --------------- 1111 1100 -4
		 */
		byte kkk = ~3;
		System.out.println(" (~3) = " + kkk);

	}

	public void conditionOperator() {
		// =============条件运算符====================
		boolean w = (100 > 10) ? true : false; // condition ? x1 : x2

		int ww = (100 < 10) ? 10 : 100;

		System.out.println("(100>10)?true:false : " + w + " (100<10)? 10:100 :"
				+ ww);
	}

}
