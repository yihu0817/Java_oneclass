package com.scxh.java.ex024.io.file.sream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileInputStreamDemo demo = new FileInputStreamDemo();
		
		long starTime = System.currentTimeMillis();
		System.out.println("========"+starTime);
		demo.testFileInputStream();
		
		long endTime = System.currentTimeMillis();
		
		long time = endTime - starTime;
		System.out.println("========"+ time +"==============");
		//==========================
		
		long starTime1 = System.currentTimeMillis();
		
		demo.testFileBufferInputStream();
		
		long endTime1 = System.currentTimeMillis();
		
		System.out.println("========"+ (endTime1 - starTime1)+"==============");
	}

	public void testFileBufferInputStream(){
		BufferedInputStream binput = null;
		try {
			
			binput = new BufferedInputStream(new FileInputStream("F:/test.txt"));
			
			int count = binput.available(); // 获取字节输入流中字节个数
			System.out.println(count);

			byte[] bytes = new byte[count];
			binput.read(bytes,0,count);
			String str = new String(bytes);
			System.out.print(str);
			
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	public void testFileInputStream() {
		try {
			FileInputStream input = new FileInputStream("F:/test.txt");

			int count = input.available(); // 获取字节输入流中字节个数
			System.out.println(count);

			byte[] bytes = new byte[count];

			int len = input.read(bytes);
			String str = new String(bytes, 0, len);
			System.out.print(str);

			// int cacheLeng = 100;
			// byte[] bytes = new byte[cacheLeng];
			// int len;
			// while( (len = input.read(bytes,0,cacheLeng))!= -1 ){
			//			
			// String str = new String(bytes,0,len,"GBK");
			// System.out.print(str);
			// }

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
