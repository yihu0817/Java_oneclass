package com.scxh.java.ex023.file.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) {
		// 建立 字符输入流FileReader
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("F:/test.txt");
			BufferedReader bReader = new BufferedReader(fileReader);
			
			//================  方一  ============
			int b;
			while( (b = bReader.read())!= -1){
				char c = (char)b;
				System.out.print(c);
			}
			
			//================  方二  ============
			
//			// 定义一个字符数组，用于接收从输入流读取的数据
//			char[] cbuf = new char[100];
//
//			// 从字符输入流读取数据赋给字符数组，返回读取的字符个数
//			int charCount = fileReader.read(cbuf);
//
//			// 将字符数组转成字符串,按照给字符个数
//			String str = new String(cbuf, 0, charCount);
//
//			System.out.println("从文件test.txt读取的数据长度是 :" + charCount + "\n "
//					+ str);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
