package com.scxh.java.ex012.classs.interfaces;

/**
 * 接口 学习，接口和抽象类是特殊的类 
 * 定义一个硬盘接口
 * 1.接口内定义的变量都是常量 
 * 2.接口： 接口是若干常量和抽象方法的集合
 * 3.类是对象的模板，    抽象类和接口是类的模板.
 * @author viktor
 * 
 */
public interface SataHdd {
	int count = 10;
	// 写数据
	public void writeData(String data);

	// 读数据
	public String readData();

}
