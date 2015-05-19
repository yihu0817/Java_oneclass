package com.scxh.java.ex023.file.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferWriterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedWriter bufWriter = null;
		try {

			String str1 = "1.任何容器类，都必须有某种方式可以将东西放进去，然后由某种方式将东西取出来.";
			String str2 = "2.存放事物是容器最基本的工作。对于ArrayList，add（）是插入对象的方法.";

			bufWriter = new BufferedWriter(new FileWriter("E:/writerFile.txt"));

			bufWriter.write(str1);
			bufWriter.newLine();
//			bufWriter.write("\r\n");  //windows下写文件换行符用 "\r\n"
//			bufWriter.write(str2);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufWriter != null) {
				try {
					bufWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
