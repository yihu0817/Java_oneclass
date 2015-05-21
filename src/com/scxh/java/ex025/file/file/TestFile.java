package com.scxh.java.ex025.file.file;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 1. 判断输入的绝对路径是代表一个文件还是一个目录。 1>若是文件输出此文件的绝对路径，并判断此文件的文件属性（是否可读写或隐藏）;
 * //2>若是目录则输出该目录下所有文件（不包括隐藏文件） 3>若是目录遍历此目录输出目录下所有文件 .
 * 
 * @author viktor
 * 
 */
public class TestFile {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

//		BufferedReader reader = new BufferedReader(new InputStreamReader(
//				System.in));
//		System.out.println("请输入文件路径:");
//		String path = reader.readLine(); // 从键盘输入文件路径
//
//		File file = new File(path); // E:/java.txt
//		searchFile(file);

		String data = "你好Java";
		
		byte[] bytes = data.getBytes();
		
		String str = new String(bytes,"GB2312");
		
		appendDataToFile(str);
	}

	public static void searchFile(File file) {
		if (file.isDirectory()) {
			// 文件目录
			File[] files = file.listFiles();

			if (files != null) {
				int length = files.length;

				for (int i = 0; i < length; i++) {
					File f = files[i];
					searchFile(f);
				}
			}
		} else {
			// 文件
			System.out.println("文件绝对路径  :" + file.getAbsolutePath() + "  "
					+ (file.canRead() ? "可读" : "不可读") + "  "
					+ (file.canWrite() ? "可写" : "不可写") + "  "
					+ (file.isHidden() ? "隐藏" : "不隐藏"));
		}
	}

	/**
	 * 添加数据到文件末尾
	 * @throws IOException 
	 */
	public static void appendDataToFile(String data) throws IOException{
		String line = data;
		
//		String path = "F:/appendFile.txt";
		String path = "F:/test.txt";
		
		File file = new File(path);
		
		String mode = "rw";
		
		RandomAccessFile rafile = new RandomAccessFile(file, mode);
		
		rafile.seek(file.length());
		
		rafile.writeBytes(line);
		
		rafile.close();
	}
}
