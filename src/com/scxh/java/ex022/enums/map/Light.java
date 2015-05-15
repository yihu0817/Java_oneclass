package com.scxh.java.ex022.enums.map;
/**
 * <<实现红灯、绿灯和黄灯，表示具体的值>>
 * 可以通过构造函数和覆写toString 方法来实现。
 * 1.首先给Light 枚举类型增加构造方法.
 * 2.然后每个枚举类型的值通过构造函数传入对应的参数，
 * 3.同时覆写toString 方法，在该方法中返回从构造函数中传入的参数
 * @author viktor
 *
 */
public enum Light {
	// 利用构造函数传参
	RED(1), GREEN(3), YELLOW(2);

	// 定义私有变量
	private int nCode;

	// 构造函数，枚举类型只能为私有
	private Light(int _nCode) {
		this.nCode = _nCode;
	}

	@Override
	public String toString() {
		return String.valueOf(this.nCode);
	}
}