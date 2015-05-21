package com.scxh.java.ex024.file.sream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SystemDemo demo = new SystemDemo();

		// demo.testSystemInput();

		// demo.testInputStreamReader();

		demo.testSystemError();

	}

	public void testSystemInput() throws IOException {
		System.out.println("从键盘读取数据:");

		byte[] b = new byte[100];

		int len = System.in.read(b);

		String str = new String(b, 0, len);

		System.out.println("你读取的数据是 :" + str);

		Class sysIn = System.in.getClass(); // BufferInputStream
		Class sysOut = System.out.getClass(); // PrintSteam

		System.out.println("System.in对象属于类 :" + sysIn.toString());
		System.out.println("system.out对象属于类 :" + sysOut.toString());
	}

	/**
	 * 
	 * 实现从键盘读取一行数据功能。
	 * 
	 *  读数据：输入流
	 *  一行的数据==字符串： 字符流 
	 *  键盘: System.in :字节输入流
	 *   InputStreamReader:将字节流转换成字符流
	 * 
	 * @throws IOException
	 */
	public void testInputStreamReader() throws IOException {
		System.out.println("从键盘输入数据:");

		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader buferReader = new BufferedReader(inputStreamReader);

		String line = buferReader.readLine();

		System.out.print("从键盘输入的数据是: \n" + line);
		
		buferReader.close();
		inputStreamReader.close();
	}

	public void testSystemError() {
		System.err.print("你好");
	}

}
