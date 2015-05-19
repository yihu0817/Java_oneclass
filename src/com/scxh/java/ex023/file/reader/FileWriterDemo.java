package com.scxh.java.ex023.file.reader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("f:/test.txt",true);

			String str = "李四";
			String str1 = "张三";
			
			fileWriter.write(str);
			fileWriter.write(str1);
			
			System.out.println("写文件成功!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
