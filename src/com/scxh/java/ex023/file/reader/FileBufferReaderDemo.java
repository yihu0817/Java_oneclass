package com.scxh.java.ex023.file.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferReaderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 建立输入流FileReader
		FileReader fileReader = null;
		try {
			
			fileReader = new FileReader("F:/test.txt");
			BufferedReader bReader = new BufferedReader(fileReader);
			
			String line = null;
			StringBuffer strBuffer = new StringBuffer();
			
			while((line = bReader.readLine()) != null){
				strBuffer.append(line);
				strBuffer.append("\n");
			}
			
			System.out.println(strBuffer);
			
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
