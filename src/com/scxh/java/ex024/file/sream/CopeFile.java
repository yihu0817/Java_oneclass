package com.scxh.java.ex024.file.sream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopeFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CopeFile copeFile = new CopeFile();
		try {

			copeFile.copyFile();

//			copeFile.copyFileTwo();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 流的构造,顺序:由内到外
	 * 流的关闭，顺序:由外到内关闭
	 * @throws IOException
	 */
	public void copyFile() throws IOException {
		BufferedInputStream bufInput = new BufferedInputStream(
				new FileInputStream("F:/test.txt"));

		FileOutputStream output = new FileOutputStream("F:/copyfile.txt");
		
		BufferedOutputStream bufOut = new BufferedOutputStream(output);

		int count = bufInput.available();

		byte[] bytes = new byte[count];

		bufInput.read(bytes, 0, count);

		bufOut.write(bytes, 0, count);

		bufInput.close();
		
	
		
		bufOut.close();
		
		output.close();
	}
	/**
	 * 复制大文件
	 * @throws IOException
	 */
	public void copyFileTwo() throws IOException {
		BufferedInputStream bufInput = new BufferedInputStream(
				new FileInputStream("F:/test.txt"));

		BufferedOutputStream bufOut = new BufferedOutputStream(
				new FileOutputStream("F:/2copyfile.txt"));
		
		byte[] b = new byte[100];
		int len;
		
		while( (len = bufInput.read(b, 0, 100)) != -1){
			bufOut.write(b, 0, len);
			bufOut.flush();
		}

		bufInput.close();
		bufOut.close();
	}

}
