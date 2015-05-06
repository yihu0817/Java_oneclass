package com.scxh.java.classs.interfaces;
/**
 * 希捷硬盘
 * @author viktor
 *
 */
public class SeagateHdd implements SataHdd {

	public String readData() {
		String content = "从希捷硬盘 读出的数据";
		return content;
	}

	public void writeData(String data) {
		System.out.println("向希捷硬盘写入数据 "+data);
	}

}
