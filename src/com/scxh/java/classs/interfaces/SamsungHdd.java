package com.scxh.java.classs.interfaces;
/**
 * 三星硬盘
 * @author viktor
 *
 */
public class SamsungHdd implements SataHdd,FixHdd {

	public String readData() {
		String content = "从三星硬盘 读出的数据";
		return content;
	}

	public void writeData(String data) {
		System.out.println("向三星硬盘写入数据 "+data);
	}

	public boolean doFix() {
		System.out.println("维修硬盘");
		return false;
	}

}
